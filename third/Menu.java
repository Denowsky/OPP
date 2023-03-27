package third;
import java.io.IOException;
import java.util.Scanner;

import third.SaveTo.Applications.Notepad;
import third.View;


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
            String wnumber = addScan("Введите рабочий номер без 8(10 цифр): ");
            PhoneNumber workNumber = new PhoneNumber(wnumber);
            Register newreg = new Register(adress, person, number, workNumber);
            String scan2 = addScan("Сохранить запись? д/н:");
            if(scan2.equals("д")){
                    tb1.append(newreg);
            }
        }
    }
}

public static void menuVariants(Notepad notes, Adressbook ab1) throws IOException {
    String menuShow = addScan("1 - Посмотреть справочник\n2 - Посмотреть опеределённую записи по запросу\n3 - Добавить запись\n4 - Выйти из меню");
    switch(menuShow){
        case "1":
            notes.readData("third/file2");
            menuVariants(notes, ab1);
        case "2":
            String lookSurname = addScan("Введите запрос(имя, фамилия, улица): ");
            View.lookFor(lookSurname, ab1);
            menuVariants(notes, ab1);
        case "3":
            addRegister(ab1);
            menuVariants(notes, ab1);
        case "4":
            break;
        default:
            System.out.println("Пункт меню не выбран, попробуйте ещё раз:");
            menuVariants(notes, ab1);
    }
    
}

public static String addScan(String str1) {
    System.out.println(str1);
    metodScan = new Scanner(System.in, "UTF-8");
    return metodScan.next();
    }
    
}
