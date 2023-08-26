/**
 * In this example we decouple the message provider and the renderer
 */
public class HelloWorld {

    public static void main(String[] args) {

        part1();
        part2();
        part3();
    }

    /**
     * Call render on StandardOutMessageRenderer without setting a MessageProvider
     */
    static void part1(){
        try{
            var mr = new StandardOutMessageRenderer();
            mr.render();

        }catch(RuntimeException ex){
            System.out.println("A runtime error is generated: " + ex.toString());
        }
    }

    /**
     * Call render on StandardOutMessageRenderer with setting a MessageProvider
     */
    static void part2(){

        // no try/catch as no runtime error expected
        var mr = new StandardOutMessageRenderer();
        var mp = new MessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }

    /**
     * Call render on StandardOutMessageRenderer with setting a MessageProvider
     */
    static void part3(){

        // no try/catch as no runtime error expected
        var mr = new ALLCAPSStandardOutMessageRenderer();
        var mp = new MessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }




}
