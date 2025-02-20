package adapter.printer;

public class PrinterDemo {

    public static Printer oldPrinter = new OldPrinter("OldPrinter");
    public static AdvancePrinter modernPrinter = new ModernPrinter("Modern Printer", 20);

    public static void main(String[] args) {

        System.out.println("test1");
        testPrint(modernPrinter);

        System.out.println("test2");
        testPrint(new OldPrinterAdapter(oldPrinter, 20));

    }

    public static void testPrint(AdvancePrinter printer){
        printer.print("Test Print");
        printer.add("Test Print");
        printer.add("Another Test Print");
        printer.print("More Test Print");
    }
}
