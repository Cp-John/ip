/**
 * tasks that happen in a specific time for a duration (e.g. a meeting on 2/10/2019 2-4pm)
 */
public class Event extends Task {
    private String time;

    public Event(String title, String time) {
        super(title);
        this.time = time;
    }

    /**
     * @return a string describing the event task
     */
    public String toString() {
        return "[E]" + super.toString() + " (at: " + time + ")";
    }
}
