import javax.security.auth.Subject;

public class Person {
    public String fullName;
    public String gender;

    public Person(String fullName, String gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public static void voice(Person person, String subject) {
        if(person.gender=="male" && subject=="шкаф"){
            System.out.println(person.fullName + " сказал проверить шкаф:");
            System.out.println("-В последний раз он видел пиджак там");
        }
        else if(person.gender=="female" && subject=="Шкаф"){
            System.out.println(person.fullName + " сказала проверить шкаф:");
            System.out.println("-В последний раз она видел пиджак там");
        }
        if(person.gender=="male" && subject=="Кот"){
            
            System.out.println(person.fullName + " позвал котика: \"кис-кис\"");
        }
        else if(person.gender=="female" && subject=="Кот"){
            System.out.println(person.fullName + " позвала котика: \"кис-кис\"");
        }
    }
}
