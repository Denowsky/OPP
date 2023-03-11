package first.HW.refacturing;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(Tree geoTree) {
        tree = geoTree.getTree();
    }

    public String spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.name == p.name && t.re == re) {
                result.add(t.p2.name);
            }
        }
        return String.format("<%s является %s для %s>", p.name, re, result);
    }

    // Person p1;
    // Relationship re;
    // Person p2;

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return String.format(format: "%s является %s для %s",p1, re, p2);
    // }

}
