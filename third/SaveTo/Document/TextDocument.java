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
            //sb.append(line);
        }
    }

    public void addAllregisters(Adressbook ab) {
        for (int index = 0; index < ab.getAdressbook().size(); index++) {
            addAllText(ab.getAdressbook().get(index).toString());
            // addAllText("\n");
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
