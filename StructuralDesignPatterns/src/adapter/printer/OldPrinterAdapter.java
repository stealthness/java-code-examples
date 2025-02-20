package adapter.printer;

public class OldPrinterAdapter implements AdvancePrinter {

    private final Printer oldPrinter;
    private final String[] q;

    public OldPrinterAdapter(Printer printer, int queueSize) {
        oldPrinter = printer;
        q = new String[queueSize];
    }

    @Override
    public void add(String printJob) {
        if (size() < q.length){
            System.out.println("print job : in queue");
        } else {
            System.out.println("print job : queue full");
        }

        // logic to add printJob to the queue
    }

    @Override
    public void print(String printJob) {
        if (oldPrinter.isReady()) {
            oldPrinter.print(printJob);
        } else {
            add(printJob);
        }
    }

    private int size(){
        // return the size of the queue (number of printJobs in the queue, not the array size)
        return 0;
    }
}
