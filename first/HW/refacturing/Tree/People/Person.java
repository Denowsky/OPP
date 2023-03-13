package Tree.People;

import Tree.CanTalk;
import Tree.Furniture.Furniture;

public abstract class Person implements CanTalk{
    public String name;
    private int age;
    public Gender sex;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public String actionToPerson(Person p2){
        return this.name + " приветствует " + p2.name;
    }

    public String actionToFurniture(Furniture l1){
        return this.name + " пытается открыть " + l1.model +" "+l1.name;
    }
}
