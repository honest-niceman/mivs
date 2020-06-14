public class Event_ {
    private String name;
    private int time;

    public Event_() {
        this.name = "";
        this.time = 0;
    }

    public Event_(String Name, int Time){
        name = Name;
        time = Time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

}
