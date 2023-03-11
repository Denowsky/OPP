package first.HW.refacturing;

import java.util.ArrayList;

public class Tree {
    
    private ArrayList<Node> tree = new ArrayList<>();
    private OppositeGen opSex = new OppositeGen();


    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Person person2, Relationship re) {
        opSex.setKeys();
        if(person1.sex==Gender.male){
            tree.add(new Node(person1, re, person2));
            tree.add(new Node(person2, opSex.getOppositesex().get(re), person1));
        }
        else{
            tree.add(new Node(person1, opSex.getOppositesex().get(re), person2));
            tree.add(new Node(person2, re, person1));
        }
}
}
