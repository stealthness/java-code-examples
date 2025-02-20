package adapter.printer;

public class ModernPrinter implements AdvancePrinter {

    private final String[] queueJobs;
    private final String name;


    public ModernPrinter(String name, int i) {
        queueJobs = new String[i];
        this.name = name;
    }

    @Override
    public void add(String printJob) {
        // printJob is added to the queue
    }

    @Override
    public void print(String printJob) {
        int queueSize = size();
        if (queueSize> 0 && queueSize < queueJobs.length) {
            add(printJob);
            System.out.println("print job : in queue");
        } else if (size() > queueJobs.length) {
            System.out.println("print job : queue full");
        }else {
            System.out.println("print job : " + printJob);
        }
    }

    public int size(){
        // return the size of the queue (number of printJobs in the queue, not the array size)
        return 0;
    }
}
