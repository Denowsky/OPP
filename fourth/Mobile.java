package fourth;

public class Mobile extends Phone implements HasTouchScreen, Pocketable{

    public Mobile(String model) {
        super("Мобильный телефон: " + model);
    }

    @Override
    public String Ringing() {
        return ring;
    }

    @Override
    public String display() {
        return screen + " диагональю 6,5 дюймов";
    }

    @Override
    public String buttons() {
       return keys + ": включения и изменения уровня звука";
    }

    @Override
    public String touch() {
        return touchScreen + " с функцией мультитач";
    }

    @Override
    public String pocketing() {
        return pocket;
    }

    @Override
    public String toString() {
        return String.format("%s\nФункции:\n  *%s\n  *%s\n  *%s\n  *%s\n  *%s", this.getModel(), this.Ringing(), this.display(), this.buttons(), this.touch(), this.pocketing());
    }
    
    
}
