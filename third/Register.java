package third;


public class Register {
    private Integer id;
    private Adress adress;
    private Person who;
    private PhoneNumber number;
    private static Integer counter = 0;

    
public Register(Adress ad, Person who, PhoneNumber number) {
        this.id = ++counter;
        this.adress = ad;
        this.who = who;
        this.number = number;
    }

public Integer getId() {
    return id;
}


public void setId(Integer id) {
    this.id = id;
}


public Adress getAdress() {
    return adress;
}


public void setAdress(Adress adress) {
    this.adress = adress;
}


public Person getWho() {
    return who;
}


public void setWho(Person who) {
    this.who = who;
}


public PhoneNumber getNumber() {
    return number;
}


public void setNumber(PhoneNumber number) {
    this.number = number;
}


public static Integer getCounter() {
    return counter;
}


public static void setCounter(Integer counter) {
    Register.counter = counter;
}

@Override
public String toString() {
    return String.format("ID: %s, ФИО: %s, Номер телефона: %s, Адрес: %s\n", id, who, number, adress);
}


public String toStringAnother() { 
return String.format("ID: %s\nФИО: %s\nНомер телефона: %s\nАдрес: %s\n", id, who, number, adress); 
}
}
