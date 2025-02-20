package adapter.printer;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class OldPrinterAdapter implements AdvancePrinter {

    private final Printer oldPrinter;
    private final Queue<String> queueJobs;
    private final int queueSize;

    public OldPrinterAdapter(Printer printer, int queueSize) {
        oldPrinter = printer;
        queueJobs = new ArrayDeque<>(queueSize);
        this.queueSize = queueSize;
    }

    @Override
    public void add(String printJob) {
        if (size() >= queueSize) {
            System.out.println("print job : queue full");
            return;
        }
        queueJobs.add(printJob);

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

    @Override
    public void printNext() {
        if (oldPrinter.isReady()) {
            Optional.ofNullable(queueJobs.poll())
                    .ifPresent(oldPrinter::print);
        }


    }

    private int size(){
        return queueJobs.size();
    }
}
