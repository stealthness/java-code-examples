package inspection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
  Write a Java program that reads the name of a class from the command line and emits the interface of
  the class in Java syntax (interface or class, modifiers, constructors, methods, fields; no method bodies).

  This Version uses streams and can limit the output
 */
public class IntrospectionWithStreams {

    private static final String METHOD_TAB = " + ";
    private static final String NEWLINE = System.lineSeparator();
    private static final String MORE = METHOD_TAB + " ... " + NEWLINE;
    private static final boolean applyLimit = true;
    private static final int limitSize = 5;

    public static void main(String[] args) {

        if (args.length > 0) {
            Arrays.stream(args).forEach(className -> {
                try {
                    Class<?> c = Class.forName(className);
                    System.out.println(String.format("Information for class : %s", className) + NEWLINE);
                    System.out.println(c.getName());
                    printClassMethods(c);
                    if (!c.isInterface()) {
                        printClassFields(c);
                        printConstructors(c);
                    }

                } catch (ClassNotFoundException e) {
                    System.out.printf("%s class not found%n", className + NEWLINE);
                }
                printTwoSpaces();
            });
        } else {
            System.out.println("No command line input");
        }
    }

    private static void printTwoSpaces() {
        System.out.println(NEWLINE+NEWLINE);
    }


    static private void printClassMethods(Class<?> c) {

        StringBuilder sb = new StringBuilder();
        Method[] methods = c.getMethods();

        if (methods.length > 0) {
            sb.append("Methods List").append(NEWLINE);
            Arrays.stream(methods)
                    .limit((applyLimit)?limitSize:methods.length)
                    .forEach(m -> sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, m.getName())));
            if (applyLimit && limitSize < methods.length){
                sb.append(MORE);
            }
        } else {
            sb.append("No Methods").append(NEWLINE);
        }
        System.out.println(sb);
    }

    static private void printClassFields(Class<?> c) {
        StringBuilder sb = new StringBuilder();
        Field[] fields = c.getFields();
        Field[] declaredFields = c.getDeclaredFields();

        if (fields.length > 0) {
            sb.append("Fields List").append(NEWLINE);
            Arrays.stream(fields)
                    .limit((applyLimit)?limitSize:fields.length)
                    .forEach(field -> sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, field.getName())) );
            if (applyLimit && limitSize < fields.length){
                sb.append(MORE);
            }
        } else {
            sb.append("No Fields").append(NEWLINE);
        }
        if (declaredFields.length > 0) {
            sb.append("Declared Fields List").append(NEWLINE);
            Arrays.stream(fields)
                    .limit((applyLimit)?limitSize:fields.length)
                    .forEach(field -> sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, field.getName())));
            if (applyLimit && limitSize < fields.length){
                sb.append(MORE);
            }
        } else {
            sb.append("No Declared Fields").append(NEWLINE);
        }
        System.out.println(sb);
    }

    static private void printConstructors(Class<?> c) {
        StringBuilder sb = new StringBuilder();
        Constructor<?>[] constructors = c.getConstructors();

        if (constructors.length > 0) {
            sb.append("Constructor List").append(NEWLINE);

            Arrays.stream(constructors)
                    .limit((applyLimit)?limitSize:constructors.length)
                    .forEach(constructor -> sb.append(getParameterList(constructor)));
            if (applyLimit && limitSize < constructors.length){
                sb.append(MORE);
            }
        } else {
            sb.append("No Constructors");
        }
        System.out.println(sb);
    }

    private static String getParameterList(Constructor<?> constructor) {
        var sb = new StringBuilder();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        sb.append(String.format("%s%s " , METHOD_TAB, constructor.getParameterCount()));
        Arrays.stream(parameterTypes).forEach(pt -> sb.append(String.format("%s,",pt.getSimpleName())));
        // remove last ","
        sb.setLength(sb.length() - 1);
        sb.append(NEWLINE);
        return sb.toString();
    }

}
