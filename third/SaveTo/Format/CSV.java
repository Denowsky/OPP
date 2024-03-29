package third.SaveTo.Format;

import java.io.FileWriter;
import java.io.IOException;

import third.SaveTo.Document.TextDocument;

public class CSV extends TextFormat {
    
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    }
