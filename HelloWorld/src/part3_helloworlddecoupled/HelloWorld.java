package part3_helloworlddecoupled;

import part3_helloworlddecoupled.messagerenderers.ALLCAPSStandardOutMessageRenderer;
import part3_helloworlddecoupled.messagerenderers.StandardOutMessageRenderer;

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
     * Call render on part3_helloworlddecoupled.messageproviders.StandardOutMessageRenderer without setting a part3_helloworlddecoupled.MessageProvider
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
     * Call render on part3_helloworlddecoupled.messageproviders.StandardOutMessageRenderer with setting a part3_helloworlddecoupled.MessageProvider
     */
    static void part2(){

        // no try/catch as no runtime error expected
        var mr = new StandardOutMessageRenderer();
        var mp = new MessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }

    /**
     * Call render on part3_helloworlddecoupled.messageproviders.StandardOutMessageRenderer with setting a part3_helloworlddecoupled.MessageProvider
     */
    static void part3(){

        // no try/catch as no runtime error expected
        var mr = new ALLCAPSStandardOutMessageRenderer();
        var mp = new MessageProvider();
        mr.setMessageProvider(mp);
        mr.render();

    }




}
