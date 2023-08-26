import java.util.Arrays;

/**
 * In this example we will display any command line arguments
 */
public class HelloWorld {

    public static void main(String[] args) {

        if (args.length > 0){
            // In IntelliJ, we can add cmd argument in the 'Edit Configuration' tab
            // to print the content of an array we us 'Arrays.toString(<array>)' to print the arguments
            System.out.println("Hello World : " + Arrays.toString(args));
        }else{
            System.out.println("No args given");
        }

    }
}
