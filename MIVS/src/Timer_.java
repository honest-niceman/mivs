import java.util.ArrayList;
import java.util.List;

public class Timer_ {
    private String id;
    private int offset;
    public ArrayList<Event_> events;

    public Timer_(String id, int offset, ArrayList<Event_> events) {
        this.id = id;
        this.offset = offset;
        this.events = events;
    }

    public int getOffset() {
        return offset;
    }

    public List<Event_> getEvents() {
        return events;
    }
}
