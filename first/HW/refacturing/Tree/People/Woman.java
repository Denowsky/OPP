package Tree.People;
public class Woman extends Person{

    public Woman(String name, int age) {
        super(name, age);
        this.sex = Gender.female;
    }
    
    @Override
    public String voice(String arg) {
        // TODO Auto-generated method stub
        return this.name + " сказала " + arg;
    }

    @Override
    public String shout(String arg) {
        // TODO Auto-generated method stub
        return this.name + " крикнула во всё горло: " + arg;
    }
}
