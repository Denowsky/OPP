public class Man extends Person{

    public Man(String name, int age) {
        super(name, age);
        this.sex = Gender.male;
    }
    
    @Override
    public String voice() {
        // TODO Auto-generated method stub
        return this.name + " сказал";
    }
}
