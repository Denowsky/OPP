package third;
public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        if (number.length()<10 || number.length()>10){
            this.number = null;
        }
        else{
            this.number = number;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        if (number == null) {
            return "Номер не определён";
        }
        else{
            return String.format("+7-%s-%s-%s", number.substring(0, 3), number.substring(3, 6), number.substring(6, 10));
        }
    }
}

