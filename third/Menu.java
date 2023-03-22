package third;
import java.util.Scanner;


public class Menu {
    public static Register contact;
    public static boolean active;
    public static Scanner metodScan;

public static void addRegister(Adressbook tb1) {
    active = true;
    while(active!=false){
        String scan = addScan("Создать новую запись? д/н:");
        if(scan.equals("н")){
            active = false;
        }
        else{
            String surname = addScan("Введите Фамилию: ");
            String name = addScan("Введите Имя: ");
            String patronymic = addScan("Введите Отчество: ");
            Person person = new Person(surname, name, patronymic);
            String city = addScan("Город: ");
            String street = addScan("Улица: ");
            String building = addScan("№ Строения, дома: ");
            String appartment = addScan("№ квартиры: ");
            Adress adress = new Adress(city, street, building, appartment);
            String pnumber = addScan("Введите номер телефона без 8(10 цифр): ");
            PhoneNumber number = new PhoneNumber(pnumber);
            Register newreg = new Register(adress, person, number);
            String scan2 = addScan("Сохранить запись? д/н:");
            if(scan2.equals("д")){
                    tb1.append(newreg);
            }
        }
    }
}


public static String addScan(String str1) {
    System.out.println(str1);
    metodScan = new Scanner(System.in, "UTF-8");
    return metodScan.next();
    }
    
}

