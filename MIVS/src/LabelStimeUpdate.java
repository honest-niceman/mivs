import javafx.concurrent.Task;

import java.util.ArrayList;

public class LabelStimeUpdate extends Task<Void> {
    private int MAXTIME;
    private int DELAY;
    private ArrayList<Integer> RANDOMARRAY;
    private int STIME = 0;

    public LabelStimeUpdate(int maxtime, int delay, ArrayList<Integer> array) {
        MAXTIME = maxtime;
        DELAY = delay;
        RANDOMARRAY = array;
    }

    @Override
    protected Void call() throws Exception {
        int i = 0;
        while (STIME <= MAXTIME){
            updateMessage("Системное время: " + STIME);
            STIME+=RANDOMARRAY.get(i);
            i++;
            Thread.sleep(DELAY);
        }
        return null;
    }
}
