package composite.tasks;

import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class ComplexTask extends SimpleTask{

    GregorianCalendar startDate;
    GregorianCalendar endDate;

    public ComplexTask(String title, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(title);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTaskDuration() {
        if (startDate == null || endDate == null) {
            return "Start date or end date is not set.";
        }
        long durationInMillis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        long durationInDays = TimeUnit.MILLISECONDS.toDays(durationInMillis);
        return "Duration: " + durationInDays + " days";
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getTaskDuration());
    }
}
