package Tree.People;

public class Man extends Person{

    public Man(String name, int age) {
        super(name, age);
        this.sex = Gender.male;
    }
    
    @Override
    public String voice(String arg) {
        // TODO Auto-generated method stub
        return this.name + " сказал " + arg;
    }

    @Override
    public String shout(String arg) {
        // TODO Auto-generated method stub
        return this.name + " издал мужественный клич: " + arg;
    }
}
