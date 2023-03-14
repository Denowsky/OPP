package Furniture;

public abstract class Furniture {
    public String name;
    public String model;
    String material;
    
    public Furniture(String name, String model, String material) {
        this.name = name;
        this.model = model;
        this.material = material;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}

