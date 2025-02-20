package adapter.printer;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;

public class ModernPrinter implements AdvancePrinter {

    private final Queue<String> queueJobs;
    private final String name;
    private final int queueSize;


    public ModernPrinter(String name, int queueSize) {
        queueJobs = new ArrayDeque<>(queueSize);
        this.name = name;
        this.queueSize = queueSize;
    }

    @Override
    public void add(String printJob) {
        if (size() >= queueSize) {
            System.out.println("print job : queue full");
            return;
        }
        queueJobs.add(printJob);
    }

    @Override
    public void print(String printJob) {
        if (Objects.nonNull(printJob)) {
            add(printJob);
        }
        printNext();
    }

    @Override
    public void printNext() {
        Optional.ofNullable(queueJobs.poll())
                .ifPresent(printJob -> System.out.println("print job : " + printJob));
    }

    public int size(){
        return queueJobs.size();
    }
}
