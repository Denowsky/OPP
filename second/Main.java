package second;

import Applications.Notepad;
import Format.CSV;

public class Main {    
public static void main(String[] args) {

    Person guyOne = new Person("Джава", "Задача", "Решалович");
    Person anotherGuy = new Person("Чан", "Джеки", "Шанхайевич");
    Person thirdGuy = new Person("Гослинг", "Райан", "Водилович");
    Task first = new Task("Создать класс \"Task\"", Priority.immediate, guyOne, "2023-03-18");
    Task second = new Task("Создать компоненту хранения данных", Priority.medium, anotherGuy, "2023-03-19");
    Task third = new Task("Создать компоненту импорта и экспорта файла или в файл", Priority.low, thirdGuy, "2023-03-20");

    Schedule table = new Schedule();
    table.append(first);
    table.append(second);
    table.append(third);

    Notepad notes = new Notepad();
    notes.newFile();
    notes.currentDocument().addAllTasks(table);
    notes.SaveAs("second/file", new CSV());
    }
}