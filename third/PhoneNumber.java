package third;
public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return String.format("+7-%s-%s-%s", number.substring(0, 3), number.substring(3, 6), number.substring(6, 10));
    }
}

