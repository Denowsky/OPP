package third;
import java.util.Scanner;


public class Menu {
    public static Register contact;
    public static boolean active;
    public static Scanner scan;
    public static Scanner metodScan;

public static void addRegister(Adressbook tb1) {
    active = true;
    while(active!=false){
        System.out.println("Создать новую запись? д/н:");
        scan = new Scanner(System.in);
        if(scan.next().equals("н")){
            active = false;
        }
        else{
            String surname = addSNP("Введите Фамилию: ");
            String name = addSNP("Введите Имя: ");
            String patronymic = addSNP("Введите Отчество: ");
            Person person = new Person(surname, name, patronymic);
            String city = addSNP("Город: ");
            String street = addSNP("Улица: ");
            String building = addSNP("№ Строения, дома: ");
            String appartment = addSNP("№ квартиры: ");
            Adress adress = new Adress(city, street, building, appartment);
            String pnumber = addSNP("Введите номер телефона без 8(10 цифр): ");
            PhoneNumber number = new PhoneNumber(pnumber);
            Register newreg = new Register(adress, person, number);
            System.out.println("Сохранить запись? д/н:");
            try (Scanner scan2 = new Scanner(System.in)) {
                if(scan2.next().equals("д")){
                    tb1.append(newreg);
                    active = false;
                }
            }
        }
    }
}

public static String addSNP(String str1) {
    System.out.println(str1);
    metodScan = new Scanner(System.in);
    return metodScan.next();
    }
    
}

