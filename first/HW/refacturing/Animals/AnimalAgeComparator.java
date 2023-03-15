package Animals;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal>
{
@Override
public int compare(Animal arg0, Animal arg1) {
    // TODO Auto-generated method stub
    return arg0.getAge()-arg1.getAge();
}
    
}
