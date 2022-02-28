package catClient;

import java.util.Comparator;

import Homework1.Cat;

public class CatComparator implements Comparator<Cat> , java.io.Serializable{

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() > o2.getAge()? 1 : o1.getAge() == o2.getAge()? 0: -1; 
        // return o1.getArea() > o2.getArea() ?  1 : o1.getArea() == o2.getArea() ? 0 : -1;
    }
    
}
