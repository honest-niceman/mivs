import javafx.concurrent.Task;

import java.util.ArrayList;

public class Label1Thread extends Task<Void> {
    private int MAXTIME;
    private int OFFSET;
    private int DELAY;
    private ArrayList<Integer> RANDOMARRAY;
    private int STIME = 0;


    public Label1Thread(int MaxTime, int Offset, int delay,ArrayList<Integer> random) {
        MAXTIME = MaxTime;
        OFFSET = Offset;
        DELAY = delay;
        RANDOMARRAY = random;
        STIME=OFFSET;
        MAXTIME+=OFFSET;
    }

    @Override
    protected Void call() throws Exception {
        int i = 0;
        while(STIME <= MAXTIME)
        {
            updateMessage("Текущее время:   " + (STIME));
            STIME+=RANDOMARRAY.get(i);
            i++;
            Thread.sleep(DELAY);
        }
        return null;
    }
}
