package Animals;

public abstract class Animal {
    String name;
    Classification kind;
    String color;
    
    public Animal(String name, Classification kind, String color) {
        this.name = name;
        this.kind = kind;
        this.color = color;
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
}
