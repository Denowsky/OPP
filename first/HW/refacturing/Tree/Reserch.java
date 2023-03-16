package Tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import People.Person;
import People.Relationship;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    HashSet<String> ageResult = new HashSet<>();
    ArrayList<Node> tree;

    public Reserch(Tree geoTree) {
        tree = geoTree.getTree();
    }

    public String FindLovedOnes(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.name.equals(p.name) && t.re.equals(re)) {
                result.add(t.p2.name);
            }
        }
        return String.format("<%s является %s для %s>", p.name, re, result);
    }

    public String FindElderThan( String operand,Integer age) {
        if(operand.equals("<") || operand.equals(">")){
            for (Node t: tree){
                if(operand.equals(">")){
                    if(t.p1.getAge()>(age)){
                        ageResult.add(t.p1.name);
                    }
                }
                else if(operand.equals("<")){
                    if(t.p1.getAge()<(age)){
                        ageResult.add(t.p1.name);
                }
            }
            }
            return String.format("Люди, у которых возраст %s %s -> %s", operand, age, ageResult);
        }
        else{
            return "укажите \">\" или \"<\"";
        }
    }
}