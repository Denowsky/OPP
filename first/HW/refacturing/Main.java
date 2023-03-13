import Applications.Notepad;
import Format.*;
import Tree.Reserch;
import Tree.Tree;
import Tree.Furniture.Furniture;
import Tree.Furniture.Lockers;
import Tree.People.Man;
import Tree.People.Person;
import Tree.People.Relationship;
import Tree.People.Woman;

public class Main {
    public static void main(String[] args) {
        Person maria = new Woman("Мария", 26);
        Person roman = new Man("Роман", 32);
        Person anna = new Woman("Анна", 12);
        Person boris = new Man("Борис", 10);
        Furniture locker = new Lockers("Старый шкаф", "Закрывающийся на замок", "Деревянный");
        Tree gt = new Tree();
        gt.append(roman, maria, Relationship.husband);
        gt.append(roman, boris, Relationship.father);
        gt.append(roman, anna, Relationship.father);
        gt.append(boris, anna, Relationship.brother);
        System.out.println(new Reserch(gt).FindLovedOnes(roman,Relationship.husband));
        System.out.println(new Reserch(gt).FindLovedOnes(maria,Relationship.wife));
        System.out.println(new Reserch(gt).FindLovedOnes(roman,Relationship.father));
        System.out.println(new Reserch(gt).FindLovedOnes(boris,Relationship.son));
        System.out.println(new Reserch(gt).FindLovedOnes(boris,Relationship.brother));
        System.out.println(new Reserch(gt).FindElderThan("<", 12));
        System.out.println(new Reserch(gt).FindElderThan(">", 12));
        System.out.println(gt.getTree());
        System.out.println(roman.voice("выделить время на поход в кино"));
        System.out.println(maria.voice("купить молочка"));
        System.out.println(boris.shout("хочу чипсов!"));
        System.out.println(anna.shout("а я хочу сникерсов!"));
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
