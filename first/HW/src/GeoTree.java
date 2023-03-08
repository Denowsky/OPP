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



    // public void checkSiblings(Person p, Relationship re) {
    //     ArrayList<Person> temp = new ArrayList<>();
    //     for (Node t : tree) {
    //         if (t.p1.fullName == p.fullName && t.re == re) {
    //             temp.add(t.p2);
    //             if (temp.size() > 1) {
    //                 for (int i = 0; i < temp.size()-1; i++) {
    //                     append(temp.get(i), temp.get(i+1), Relationship.brother);
    //                 }
    //             }
    //         }
    //     }
    // }

