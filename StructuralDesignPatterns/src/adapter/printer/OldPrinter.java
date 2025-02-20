package adapter.printer;

public class OldPrinter implements Printer {

    String printerName;
    boolean isReady;

    public OldPrinter(String name) {
        printerName = name;
    }

    @Override
    public void print(String printerJob){
        if (isReady){
            System.out.println(printerName + " : " + printerJob);
        }
        // else ignore as this printer has no queue to store printJobs
    }

    @Override
    public boolean isReady() {
        return isReady;
    }

    // further methods for printer logic
}
