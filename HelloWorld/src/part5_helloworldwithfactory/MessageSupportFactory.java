package part5_helloworldwithfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.Properties;

public class MessageSupportFactory {

    private static final MessageSupportFactory instance = new MessageSupportFactory();

    private MessageProvider provider;
    private MessageRenderer renderer;

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    /**
     * Private constructor to enforce singleton pattern
     */
    private MessageSupportFactory(){
        Properties properties = new Properties();
        // mac/linux path = "HelloWorld/res/beans.properties"
        String path = "HelloWorld\\res\\bean.properties";
        try{
            try (var fis = new FileInputStream(path)){
                properties.load(fis);
            } catch (IOException e){
                System.out.println("Path " + path + " not found");
            } catch (Exception e){
                System.out.println("Exception: " + e);
            }

            String rendererClass = properties.getProperty("renderer");
            renderer = (MessageRenderer) newInstanceOf(rendererClass);

            String providerClass = properties.getProperty("provider");
            provider = (MessageProvider) newInstanceOf(providerClass);

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                InstantiationException | IllegalAccessException e) {
            System.out.println("Exception: " + e);
        }

    }

    /**
     * Create a new instance of a class
     * @param className
     * @return an instance of the class with className
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    private Object newInstanceOf(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> classObject = Class.forName(className);
        Constructor<?> constructor = classObject.getConstructor();
        return constructor.newInstance();
    }
}
