import Applications.Notepad;
import Format.*;

public class Main {
    public static void main(String[] args) {
        Person maria = new Woman("Мария", 26);
        Person roman = new Man("Роман", 32);
        Person anna = new Woman("Анна", 12);
        Person boris = new Man("Борис", 10);
        Furniture locker = new Lockers("Старый шкаф", "Закрывающийся на замок", "Деревянный");
        // Person valentina = new OldWoman("Валентина", 56);
        // Person sebastian = new OldMan("Себастьян", 60);
        Tree gt = new Tree();
        gt.append(roman, maria, Relationship.husband);
        gt.append(roman, boris, Relationship.father);
        gt.append(roman, anna, Relationship.father);
        gt.append(boris, anna, Relationship.brother);
        System.out.println(new Reserch(gt).spend(roman,Relationship.husband));
        System.out.println(new Reserch(gt).spend(maria,Relationship.wife));
        System.out.println(new Reserch(gt).spend(roman,Relationship.father));
        System.out.println(new Reserch(gt).spend(boris,Relationship.son));
        System.out.println(new Reserch(gt).spend(boris,Relationship.brother));
        System.out.println(gt.getTree());
        System.out.println(roman.voice());
        System.out.println(maria.voice());
        System.out.println(roman.actionToPerson(boris));
        System.out.println(boris.actionToPerson(maria));
        System.out.println(roman.actionToFurniture(locker));

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
    }
    
}
