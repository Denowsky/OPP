package first.Seminar;

import java.util.ArrayList;

public class Person {
    private String name;
    ArrayList<Person> family = new ArrayList<>();

public Person(String name) {
    this.name = name;
}
public ArrayList<Person> getFamily() {
    return family;
}
public void setFamily(ArrayList<Person> family) {
    this.family = family;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return this.name;
}

public void appendToFamily(Person person) {
    if (person != this && person != null){
    family.add(person);
    }
}
}

