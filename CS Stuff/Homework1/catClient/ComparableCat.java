package catClient;

import Homework1.Cat;
import Homework1.Color;

public class ComparableCat extends Cat {
    public ComparableCat(String name, double age, Color color, String type){
        super(name, age, color, type);
    }
    public ComparableCat( String name, double age){
        super(name, age);
        
    }

    @Override
    public int compareTo(Cat o) {
        if (this.getAge() > o.getAge())
            return 1;
        else if (this.getAge() < o.getAge())
            return -1;
        else 
            return 0;
    }
    @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Age: " + getAge() + " Age: " + getAge() +
      " Color: " + getColor() + " Type: " + getType();
  }
    
}
