import java.util.Random;

import Animals.Animal;
import Animals.Cat;
import Animals.Chameleon;
import Animals.Classification;
import Animals.Penguin;
import Applications.Notepad;
import Format.*;
import Tree.Reserch;
import Tree.Tree;
import Furniture.Furniture;
import Furniture.Lockers;
import People.Man;
import People.Person;
import People.Relationship;
import People.Woman;

public class Main {
    public static void main(String[] args) {
        Person maria = new Woman("Мария", 26);
        Person roman = new Man("Роман", 32);
        Person anna = new Woman("Анна", 12);
        Person boris = new Man("Борис", 10);
        Furniture locker = new Lockers("Старый шкаф", "Закрывающийся на замок", "Деревянный");
        Animal cat = new Cat("Джек", Classification.mammal, "Рыжий");
        Animal peng = new Penguin("Пенгвин", Classification.bird, "пингвиновый");
        Animal cham = new Chameleon("Хам", Classification.reptile,"Разный");
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
        System.out.println(anna.shout("а я не понимаю, что нужно делать, чтобы получить оценку выше \"удовлетворительно!\""));
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
