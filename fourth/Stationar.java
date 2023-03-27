package fourth;

public class Stationar extends Phone implements HasWire{

    public Stationar(String model) {
        super(model);
    }

    @Override
    public void Ringing() {
        System.out.println(ring);
    }

    @Override
    public void display() {
        System.out.println(screen);
    }

    @Override
    public void buttons() {
        System.out.println(keys);
    }
    
}
