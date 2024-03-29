package Format;

import java.io.FileWriter;
import java.io.IOException;

import Document.TextDocument;

public class CSV extends TextFormat {
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write("<CSV Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
