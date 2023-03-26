package third;


public class View {
    String record;

    public static void lookFor(String surname, Adressbook ab){
    Integer counter = 0;
    for (int index = 0; index < ab.getAdressbook().size(); index++) {
        if(ab.getAdressbook().get(index).toString().contains(surname)){
            System.out.println(ab.getAdressbook().get(index).toString());
            counter++;
        }
    }
    if(counter.equals(0)){
        System.out.println("По запросу \"" + surname + "\" записи не найдены");
    }
    }
}
