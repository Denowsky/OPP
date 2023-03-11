package first.HW.refacturing;

import java.util.HashMap;

public class OppositeGen {
   public HashMap<Relationship, Relationship> oppositesex = new HashMap<>();

   public void setKeys() {
    oppositesex.put(Relationship.husband, Relationship.wife);
    oppositesex.put(Relationship.son, Relationship.daughter);
    oppositesex.put(Relationship.father, Relationship.mother);
    oppositesex.put(Relationship.brother, Relationship.sister);
    oppositesex.put(Relationship.grandpa, Relationship.grandma);
   }

    public HashMap<Relationship, Relationship> getOppositesex() {
        return oppositesex;
    }
}
