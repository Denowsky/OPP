package fourth;

public class Taxopthone extends Phone implements HasWire, NeedCoins{

    public Taxopthone(String model) {
        super("Таксофон: " + model);
    }

    @Override
    public String Ringing() {
        return ring;
    }

    @Override
    public String buttons() {
        return keys + ": 0123456789*#, вернуть сдачу, экстренный звонок";
    }

    @Override
    public String display() {
        return screen + " диагональю 2,2 дюйма";
    }

    @Override
    public String cash() {
        return coins;
    }

    @Override
    public String wired() {
        return wire + " в металлической оплётке, длина - 0,55 метра";
    }
    
    @Override
    public String toString() {
        return String.format("%s\nХарактеристики:\n  *%s\n  *%s\n  *%s\n  *%s\n  *%s", this.getModel(), this.Ringing(), this.cash(), this.display(), this.buttons(), this.wired());
    }
}
