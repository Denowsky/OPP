package third;

import java.util.ArrayList;

public class Adressbook {
    private ArrayList<Register> adressbook = new ArrayList<>();

    public ArrayList<Register> getAdressbook() {
        return adressbook;
    }

    public void setAdressbook(ArrayList<Register> table) {
        this.adressbook = table;
    }

    public void append(Register t1) {
        adressbook.add(t1);
    } 

}
