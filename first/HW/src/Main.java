
 import Applications.Notepad;
 import Format.*;
 

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "female");
        Person vasya = new Person("Вася", "male");
        Person masha = new Person("Маша", "female");
        Person jane = new Person("Женя", "female");
        Person ivan = new Person("Ваня", "male");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.appendSibling(vasya, masha);
        gt.append(ivan, masha);
        gt.append(ivan, vasya);
        gt.appendSibling(ivan, jane);
        Animal cat = new Cat("Барски");


        System.out.println(new Reserch(gt).spend(ivan,Relationship.father));
        System.out.println(new Reserch(gt).spend(ivan,Relationship.brother));
        System.out.println(new Reserch(gt).spend(irina,Relationship.mother));
        System.out.println(new Reserch(gt).spend(masha,Relationship.daughter));
        System.out.println(new Reserch(gt).spend(masha,Relationship.sister));
        Person.voice(ivan,"Кот");
        System.out.println(cat.voice());
        Person.voice(masha, "Шкаф");

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
    }

}
