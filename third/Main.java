package third;

import third.SaveTo.Applications.Notepad;
import third.SaveTo.Format.CSV;
import third.Menu;

public class Main{    
public static void main(String[] args) {

    Person thirdGuy = new Person("Гослинг", "Райан", "Водилович");
    PhoneNumber ryan = new PhoneNumber("9877044816");
    Person firstGuy = new Person("Чан", "Джеки", "Часпикович");
    PhoneNumber jack = new PhoneNumber("9995554667");
    Person secondGuy = new Person("Норрис", "Чак", "Дельтович");
    PhoneNumber chak = new PhoneNumber("8005553535");
    Adress cheboksary = new Adress("Чебоксары", "Первомайская", "26", "103");
    Adress kazan = new Adress("Казань", "Первобытная", "99", "108");
    Adress perm = new Adress("Пермь", "Второмайская", "3", "1");
    Register regOne = new Register(cheboksary, thirdGuy, ryan);
    Register regTwo = new Register(kazan, firstGuy, jack);
    Register regThree = new Register(perm, secondGuy, chak);
    Adressbook ab = new Adressbook();
    ab.append(regOne);
    ab.append(regTwo);
    ab.append(regThree);
    // Menu.addRegister(ab);

    Notepad notes = new Notepad();
    notes.newFile();
    notes.currentDocument().addAllregisters(ab);
    notes.SaveAs("third/SavedFiles/file", new CSV());
    }
}