package third.SaveTo.Applications;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import third.SaveTo.Document.TextDocument;
import third.SaveTo.Format.TextFormat;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }

    public void ReadData(String path) throws IOException{

            PrintStream fileOut = new PrintStream(
                 path + ".csv");
            fileOut.println(10.5);
            fileOut.printf(
                  "%s - %d - %f", "hi", 10, 1.1);
            fileOut.close();

    }
}
