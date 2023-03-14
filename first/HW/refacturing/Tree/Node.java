package Tree;

import People.Person;
import People.Relationship;

public class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    public Node(String string, Relationship parent, String string2) {
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1.name, re, p2.name);
    }

}
