package fourth;

public class Stationar extends Phone implements HasWire{


    public Stationar(String model) {
        super("Стационарный телефон: " + model);
    }

    @Override
    public String wired() {
        return wire + "спиральный, длинной 1,5 метра";
    }

    @Override
    public String Ringing() {
        return ring;
    }

    @Override
    public String buttons() {
        return keys + ": 0123456789*#";
    }

    @Override
    public String display() {
        return screen + " диагональю 2,4 дюйма";
    }

    @Override
    public String toString() {
        return String.format("%s\nФункции:\n  *%s\n  *%s\n  *%s\n  *%s", this.getModel(), this.Ringing(), this.display(), this.buttons(), this.wired());
    }
}
