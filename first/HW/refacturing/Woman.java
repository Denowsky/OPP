package first.HW.refacturing;

public class Woman extends Person{

    public Woman(String name, int age) {
        super(name, age);
        this.sex = Gender.female;
    }
    
    @Override
    public String voice() {
        // TODO Auto-generated method stub
        return this.name + "сказала";
    }
}
