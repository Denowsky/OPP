package third.SaveTo.Applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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

    public void readData(String path) 
                      throws IOException {
 
        Reader reader = new FileReader(
                  path + ".csv");
        BufferedReader buffReader = 
                  new BufferedReader(reader);
 
        while (buffReader.ready()) {
            System.out.println(
                  buffReader.readLine());
        }
 
        reader.close();
        buffReader.close();
    }
}
