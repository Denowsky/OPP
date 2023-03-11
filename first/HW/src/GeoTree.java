import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        if(parent.gender=="male"){
            tree.add(new Node(parent, Relationship.father, children));
        }
        else{
            tree.add(new Node(parent, Relationship.mother, children));
        }
        if(children.gender=="male"){
            tree.add(new Node(children, Relationship.son, parent));
        }
        else{
            tree.add(new Node(children, Relationship.daughter, parent));
        }
    }

    public void appendSibling(Person siblingPerson, Person siblingPerson2) {
        if(siblingPerson.gender=="male"){
            tree.add(new Node(siblingPerson, Relationship.brother, siblingPerson2));
        }
        else{
            tree.add(new Node(siblingPerson, Relationship.sister, siblingPerson2));
        }
        if(siblingPerson2.gender=="male"){
            tree.add(new Node(siblingPerson2, Relationship.brother, siblingPerson));
        }
        else{
            tree.add(new Node(siblingPerson2, Relationship.sister, siblingPerson));
        }
        }
    }


