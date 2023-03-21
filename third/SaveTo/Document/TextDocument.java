package third.SaveTo.Document;

import third.Adressbook;

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
        }
    }

    public void addAllregistersVarOneLine(Adressbook ab) {
        for (int index = 0; index < ab.getAdressbook().size(); index++) {
            addAllText(ab.getAdressbook().get(index).toString());
        }
    }

    public void addAllregistersVarFourLine(Adressbook ab) {
        for (int index = 0; index < ab.getAdressbook().size(); index++) {
            addAllText(ab.getAdressbook().get(index).toStringAnother());
        }
    }

    public String getData(){
        return sb.toString();
    }

}
