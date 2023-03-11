package first.HW.refacturing;

public class Main {
    public static void main(String[] args) {
        Person maria = new Woman("Мария", 26);
        Person roman = new Man("Роман", 32);
        Person anna = new Woman("Анна", 12);
        Person boris = new Man("Борис", 10);
        // Person valentina = new OldWoman("Валентина", 56);
        // Person sebastian = new OldMan("Себастьян", 60);
        Tree gt = new Tree();
        gt.append(roman, maria, Relationship.husband);
        gt.append(roman, boris, Relationship.father);
        gt.append(roman, anna, Relationship.father);
        System.out.println(new Reserch(gt).spend(roman,Relationship.husband));
        System.out.println(new Reserch(gt).spend(maria,Relationship.wife));
        System.out.println(new Reserch(gt).spend(roman,Relationship.father));
        System.out.println(roman.voice());
    }
    
}
