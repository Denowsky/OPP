package Animals;

public abstract class Animal{
    String name;
    Classification kind;
    String color;
    Integer age;

    public Animal(String name, Classification kind, String color, Integer age) {
        this.name = name;
        this.kind = kind;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Classification getKind() {
        return kind;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(Classification kind) {
        this.kind = kind;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

    // @Override
    // public int compareTo(Animal arg0) {
    //     return this.getAge()-arg0.getAge();
    // }
}
