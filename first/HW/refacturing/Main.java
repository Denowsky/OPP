import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import Animals.Animal;
import Animals.AnimalAgeComparator;
import Animals.Cat;
import Animals.Chameleon;
import Animals.Classification;
import Animals.Horse;
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
        Animal cat = new Cat("Джек", Classification.mammal, "Рыжий", 1);
        Animal peng = new Penguin("Пенгуин", Classification.bird, "пингвиновый", 2);
        Animal cham = new Chameleon("Хам", Classification.reptile,"Разный", 3);
        Animal horse = new Horse("Ветер", Classification.mammal, "Бурый", 10);
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
        System.out.println(anna.shout("не важно, что я тут кричу - оценка будет удовлетворительная"));
        System.out.println(roman.actionToPerson(boris));
        System.out.println(boris.actionToPerson(maria));
        System.out.println(roman.actionToFurniture(locker));

        ArrayList <Animal> zoo = new ArrayList<>();
        zoo.add(horse);
        zoo.add(peng);
        zoo.add(cat);
        zoo.add(cham);

        Iterator<Animal> iterator = zoo.iterator();
        while(iterator.hasNext()){
            Animal next = iterator.next();
            System.out.println(next);
            if(next.getName().equals("Хам")){
                iterator.remove();
            }
        }
        System.out.println(zoo);

        zoo.add(cham);
        Collections.sort(zoo, new AnimalAgeComparator());
        System.out.println(zoo);


        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
    
}
