package Document;

import java.util.ArrayList;

import second.Schedule;
import second.Task;

public class TextDocument {

    StringBuilder sb;
    public TextDocument() {
        sb = new StringBuilder();
    }

    public TextDocument(String data) {
        this();
        addAllText(data);        
    }

    public void addAllText(String text){
        sb.append(text + "\n");
    }

    public void addAllLines(String[] lines){
        for (String line : lines) {
            addAllText(line);
            //sb.append(line);
        }
    }

    public void addAllTasks(Schedule t1) {
        for (int index = 0; index < t1.getTable().size(); index++) {
            addAllText(t1.getTable().get(index).toString());
            addAllText("\n");
        }
    }

    // public void addAllText(String ... data){
    //     for (String line : data) {
    //         sb.append(line);
    //         //addAllText(line);
    //     }
    // }
    
    public String getData(){
        return sb.toString();
    }

}
