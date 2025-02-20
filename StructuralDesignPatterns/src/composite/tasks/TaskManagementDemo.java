package composite.tasks;

import java.util.GregorianCalendar;

/**
 * The TaskManagementDemo class demonstrates the use of the composite pattern
 * This code was modified from https://www.geeksforgeeks.org/composite-design-pattern-in-java/
 */
public class TaskManagementDemo {


    public static void main(String[] args) {
        // Creating simple tasks
        Task simpleTask1 = new SimpleTask("Complete Coding");
        Task simpleTask2 = new SimpleTask("Write Documentation");

        // Creating a task list
        TaskList projectTasks = new TaskList("Project Tasks");
        projectTasks.addTask(simpleTask1);
        projectTasks.addTask(simpleTask2);

        // Nested task list
        TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementation"));

        GregorianCalendar startDate = new GregorianCalendar(2021, 1, 1);
        GregorianCalendar endDate = new GregorianCalendar(2021, 1, 15);
        phase1Tasks.addTask(new ComplexTask("Testing", startDate, endDate));

        projectTasks.addTask(phase1Tasks);

        // Displaying tasks
        projectTasks.display();
    }
}

