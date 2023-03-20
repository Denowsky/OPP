package second;
import java.util.Scanner;


public class Menu {
    public static Task assignment;
    public static boolean active;
    public static Scanner scan;

public static void createTask(Schedule tb1, Person p1) {
    active = true;
    while(active!=false){
        System.out.println("Создать задачу? y/n:");
        scan = new Scanner(System.in);
        if(scan.next().equals("n")){
            active = false;
        }
        else{
            System.out.println("Введите название задачи: ");
            Scanner scan1 = new Scanner(System.in);
            String task = scan1.nextLine();
            System.out.println("Выберите уровень приоритета: ");
            Scanner scan2 = new Scanner(System.in);
            Priority level;
            switch (scan2.nextInt()){
                case 1:
                level = Priority.immediate;
                case 2:
                level = Priority.medium;
                case 3:
                level = Priority.low;
                default:
                level = Priority.low;
            }
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Введите Дедлайн в формате ГГГГ-ММ-ДД: ");
            String deadline = scan3.nextLine();
            Task t1 = new Task(task, level, p1, deadline);
            Scanner scan4 = new Scanner(System.in);
            System.out.println("Сохранить задачу? y/n:");
            if(scan4.next().equals("y")){
                tb1.append(t1);
                active = false;
            }
        }
    }
}
}