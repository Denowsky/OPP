import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children, Relationship relationship) {
        tree.add(new Node(parent, relationship, children));
        tree.add(new Node(children, relationship, parent));
    }

    public void checkSiblings(Person p, Relationship re) {
        ArrayList<Person> temp = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                temp.add(t.p2);
                if (temp.size() > 1) {
                    for (int i = 0; i < temp.size()-1; i++) {
                        append(temp.get(i), temp.get(i+1), Relationship.brother);
                    }
                }
            }
        }
    }

}
