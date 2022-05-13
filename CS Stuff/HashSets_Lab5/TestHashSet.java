import java.util.*;

public class TestHashSet {
    public static void main(String[] args) { // Create a hash set
        Set<Cat> set = new HashSet<>();
        // Add cats to the set 
        set.add(new Cat(2, "Masha")); 
        set.add(new Cat(1, "Prince")); 
        set.add(new Cat(5, "Sam"));
        set.forEach(i -> System.out.println(i));
        System.out.println("New cats arrived");
        Cat newSheCat = new Cat(3, "Luna");
        Cat newHeCat = new Cat(3, "Max");
        set.add(newSheCat);
        set.add(newSheCat);
        set.add(newSheCat);
        set.add(newHeCat);
        set.add(newHeCat);
        System.out.println("set.contains(newSheCat) is:" +set.contains(newSheCat)); 
        System.out.println("set.contains(newHeCat) is:" +set.contains(newHeCat)); 
        set.remove(newHeCat);
        set.forEach(i -> System.out.println("\n"+i));
        Object[] setArr = set.toArray(); // to array method
        Arrays.stream(setArr).forEach(i-> System.out.print(" " +i));
        System.out.println(set.contains(newHeCat));
    }
}
class Cat implements Comparable{
    private int age;
    private String name;

    public Cat(int age, String name) { 
        super();
        this.age = age;
        this.name = name; }

    public int getAge() { 
        return age;
    }

    public void setAge(int age) { 
        this.age = age;
    }

    public String getName() {
    return name; }

    public void setName(String name) {
         this.name = name;
    }

    @Override
    public String toString() {
    return "\nCat [age=" + age + ", name=" + name + ", getAge()=" + getAge() + ", getName()=" + getName()
    + ", getClass()=" + getClass() /*+ ", hashCode()=" + hashCode() */+ ", toString()=" + super.toString()+ "]";
    }

    public int compareTo(Object o){
        if(this.hashCode() > ((Cat)o).hashCode())
        return 1;
        else if (this.hashCode() < ((Cat)o).hashCode())
        return -1; else
        return 0;
    }
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        } 
        if (o == this){
            return true;
        }
        if (getClass() != o.getClass()){
            return false;
        }
        Cat c = (Cat) o;
        return (this.getAge() == c.getAge()) && (this.getName()!= null && name.equals(c.getName()));
        }
    


}//end cat
