package inspection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
  Write a Java program that reads the name of a class from the command line and emits the interface of
  the class in Java syntax (interface or class, modifiers, constructors, methods, fields; no method bodies).
 */
public class Introspection {

    private static final String METHOD_TAB = " + ";
    private static final String NEWLINE = System.lineSeparator();

    public static void main(String[] args) {

        if (args.length > 0) {
            printClassInfo(args);
        } else {
            System.out.println("No command line input");
            printClassInfo(new String[]{"Foo"});
        }
    }

    private static void printClassInfo(String[] args){
        for (String className : args) {
            try {
                Class<?> c = Class.forName(className);
                System.out.println(String.format("Information for class : %s", className) + NEWLINE);
                System.out.println(c.getName());
                printClassMethods(c);
                if (!c.isInterface()){
                    printClassFields(c);
                    printConstructors(c);
                }

            } catch (ClassNotFoundException e) {
                System.out.printf("%s class not found%n", className + NEWLINE);
            }
            printTwoSpaces();
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

            for (Method method : methods) {
                sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, method.getName()));
            }

        } else {
            sb.append("No Methods").append(NEWLINE);
        }
        System.out.println(sb.toString());
    }

    static private void printClassFields(Class<?> c) {
        var sb = new StringBuilder();
        Field[] fields = c.getFields();
        Field[] declaredFields = c.getDeclaredFields();

        if (fields.length > 0) {
            sb.append("Fields List").append(NEWLINE);
            for (Field field : fields) {
                sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, field.getName()));
            }
        } else {
            sb.append("No Fields").append(NEWLINE);
        }
        if (declaredFields.length > 0) {
            sb.append("Declared Fields List").append(NEWLINE);
            for (Field field : declaredFields) {
                sb.append(String.format("%s%s" + NEWLINE, METHOD_TAB, field.getName()));
            }
        } else {
            sb.append("No Declared Fields").append(NEWLINE);
        }


        System.out.println(sb.toString());
    }

    static private void printConstructors(Class<?> c) {
        StringBuilder sb = new StringBuilder();
        Constructor<?>[] constructors = c.getConstructors();

        if (constructors.length > 0) {
            sb.append("Constructor List").append(NEWLINE);
            for (Constructor<?> constructor : constructors) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();

                sb.append(String.format("%s%s " , METHOD_TAB, constructor.getParameterCount()));
                for (Class<?> pt: parameterTypes){
                    sb.append(String.format("%s,",pt.getSimpleName()));
                }
                // remove last ","
                sb.setLength(sb.length() - 1);
                sb.append(NEWLINE);
            }
        } else {
            sb.append("No Constructors");
        }
        System.out.println(sb.toString());
    }

}
