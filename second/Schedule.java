package second;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Task> table = new ArrayList<>();

    public ArrayList<Task> getTable() {
        return table;
    }

    public void setTable(ArrayList<Task> table) {
        this.table = table;
    }

    public void append(Task t1) {
        table.add(t1);
    } 

}
