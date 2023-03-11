import java.util.HashMap;

public class OppositeGen {
   public HashMap<Relationship, Relationship> oppositesex = new HashMap<>();

   public void setKeys() {
    oppositesex.put(Relationship.husband, Relationship.wife);
    oppositesex.put(Relationship.father, Relationship.mother);
    oppositesex.put(Relationship.brother, Relationship.sister);
   }

    public HashMap<Relationship, Relationship> getOppositesex() {
        return oppositesex;
    }
}
