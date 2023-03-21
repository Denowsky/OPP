package third.SaveTo.Interface;

import third.SaveTo.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
