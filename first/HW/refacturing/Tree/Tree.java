package Tree;
import java.util.ArrayList;

import Tree.People.Gender;
import Tree.People.OppositeGen;
import Tree.People.Person;
import Tree.People.Relationship;

public class Tree {
    
    private ArrayList<Node> tree = new ArrayList<>();
    private OppositeGen opSex = new OppositeGen();


    public ArrayList<Node> getTree() {
        return tree;
    }

    public Relationship child(Gender sex) {
        if(sex==Gender.male){
            return Relationship.son;
        }
        else{
            return Relationship.daughter;
        }
    }

    public void append(Person person1, Person person2, Relationship re) {
        opSex.setKeys();
        if(re == Relationship.father || re == Relationship.mother){
            if(person1.sex == Gender.male)
            {
                tree.add(new Node(person1, re, person2));
                tree.add(new Node(person2, child(person2.sex), person1));
            }
            else{
                tree.add(new Node(person1, opSex.oppositesex.get(re), person2));
                tree.add(new Node(person2, child(person2.sex), person1));
            }
        }
        else{
            tree.add(new Node(person1, re, person2));
            tree.add(new Node(person2, opSex.oppositesex.get(re), person1));
        }
}
}
    
