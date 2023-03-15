package Animals;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal arg0, Animal arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }

}
    