package third;


public class Register {
    private Integer id;
    private Adress adress;
    private Person who;
    private PhoneNumber number;
    private PhoneNumber number2;
    private static Integer counter = 0;

    
public Register(Adress ad, Person who, PhoneNumber number, PhoneNumber number2) {
        this.id = ++counter;
        this.adress = ad;
        this.who = who;
        this.number = number;
        this.number2 = number2;
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

public PhoneNumber getWorkNumber() {
    return number2;
}

public void setNumber(PhoneNumber number) {
    this.number = number;
}

public void setWorkNumber(PhoneNumber number2) {
    this.number2 = number2;
}

public static Integer getCounter() {
    return counter;
}


public static void setCounter(Integer counter) {
    Register.counter = counter;
}

@Override
public String toString() {
    return String.format("ID: %s, ФИО: %s, Номер телефона: %s, Рабочий номер: %s, Адрес: %s\n", id, who, number, number2, adress);
}


public String toStringAnother() { 
return String.format("ID: %s\nФИО: %s\nНомер телефона: %s\nРабочий номер: %s,\nАдрес: %s\n", id, who, number, number2, adress); 
}
}
