import java.util.*;

public class TestHashSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<Integer> set = new HashSet<>();
    int sum = 0;
    // Add strings to the set
    set.add(100);
    set.add(4);
    set.add(13);
    set.add(444);
    set.add(39);
    set.add(54);
    set.add(79);

    // print the values in the current set
    System.out.println(set);
    for (Integer a : set){
        sum = sum + a.hashCode(); // adds the hash code value to the sum 
       // System.out.println(a.hashCode());

    }
    
    System.out.println("The sum of the hash code is: " + sum);

    set.forEach(e -> System.out.print(Math.pow(e, 2) + " "));// prints each value squared
    set.forEach(e -> System.out.print("\n The Square root of: " + e + " is : " + Math.sqrt(e)));
    System.out.println(set.hashCode());

    // testing adding hash code of string
   /* Set<String> s = new HashSet<>();
    s.add("Tunmise");
    s.add("Alabi");
    System.out.println(s);
    int sum2 = 0;
    for (String b : s){
        sum2 = sum2 + b.hashCode(); 
    }
    System.out.println("The sum of the hash code is: " + sum2);*/
  }
}