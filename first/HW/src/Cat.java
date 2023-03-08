public class Cat extends Animal{

    private String name;
    static int counter = 0;

    public Cat(String name) {
        super("Кот");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String animalClass = super.toString();
        return animalClass + " " + this.name;
    }

    public String voice(){
        return "Кот " + this.name + " говорит мяу";
    }
}
