package fourth;

public class Mobile extends Phone implements HasTouchScreen, Pocketable{

    public Mobile(String model) {
        super(model);
    }

    @Override
    public void Ringing() {
        System.out.println(ring);
    }

    @Override
    public void display() {
        System.out.println(screen + " диагональю 6,5 дюймов");
    }

    @Override
    public void buttons() {
        System.out.println(keys + " включения, изменения уровня звука");
    }

    @Override
    public void touch() {
        System.out.println(touchScreen + " с функцией мультитач");
    }

    @Override
    public String pocketing() {
        System.out.println(pocket);
    }

    @Override
    public String toString() {
        return String.format("Модель:%s\nФункции:\n  *%s\n  *%s\n  *%s\n  *%s\n  *%s", this.getModel(), this.Ringing(), this.buttons(), this.display(), this.pocketing());
    }
    
    
}
