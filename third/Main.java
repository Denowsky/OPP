package third;

import java.io.IOException;

import third.SaveTo.Applications.Notepad;
import third.SaveTo.Format.CSV;

public class Main{    
public static void main(String[] args) throws IOException {

    Person thirdGuy = new Person("Гослинг", "Райан", "Водилович");
    PhoneNumber ryan = new PhoneNumber("9877044816");
    PhoneNumber ryanWork = new PhoneNumber("959624516");
    Person firstGuy = new Person("Чан", "Джеки", "Часпикович");
    PhoneNumber jack = new PhoneNumber("9995554667");
    PhoneNumber jackWork = new PhoneNumber("7785461329");
    Person secondGuy = new Person("Норрис", "Чак", "Дельтович");
    PhoneNumber chak = new PhoneNumber("8005553535");
    PhoneNumber chakWork = new PhoneNumber("8721452135");
    Adress cheboksary = new Adress("Чебоксары", "Первомайская", "26", "103");
    Adress kazan = new Adress("Казань", "Первобытная", "99", "108");
    Adress perm = new Adress("Пермь", "Второмайская", "3", "1");
    Register regOne = new Register(cheboksary, thirdGuy, ryan, ryanWork);
    Register regTwo = new Register(kazan, firstGuy, jack, jackWork);
    Register regThree = new Register(perm, secondGuy, chak, chakWork);
    Adressbook ab = new Adressbook();
    ab.append(regOne);
    ab.append(regTwo);
    ab.append(regThree);
    
    Notepad notes = new Notepad();
    notes.newFile();
    notes.currentDocument().addAllregistersVarOneLine(ab);
    notes.SaveAs("third/file1", new CSV());
    notes.newFile();
    notes.currentDocument().addAllregistersVarFourLine(ab);
    notes.SaveAs("third/file2", new CSV());

    Menu.menuVariants(notes, ab);

    }
}