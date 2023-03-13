package Interface;

import Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
