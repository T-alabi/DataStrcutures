import java.util.*;

public class TestCollection {
  public static void main(String[] args) {
    Vector<String> collection1 = new Vector<>();
    collection1.add("New York"); 
    collection1.add("Atlanta"); 
    collection1.add("Dallas"); 
    collection1.add("Madison"); // Add "Madison" to collection1
    //the belw cities wee added for 2.3
    collection1.add("Roselle");
    collection1.add("Boston");
    collection1.add("Union");
    collection1.add("Elizabth");



    System.out.println("A list of cities in collection1:");
    System.out.println(collection1);

    System.out.println("\nIs Dallas in collection1? "
      + collection1.contains("Dallas"));

    collection1.remove("Dallas");
    System.out.println("\n" + collection1.size() + 
       " cities are in collection1 now");

    Collection<String> collection2 = new Vector<>();
    collection2.add("Seattle"); 
    collection2.add("Portland"); 
    collection2.add("Los Angles"); 
    collection2.add("Atlanta"); 
    //I added all of the cities below for 2.4. 1 that is in collections 1 aswell
    collection2.add("Las vegas"); 
    collection2.add("Union"); 
    collection2.add("Toronto"); 
    //all of these cities were added for 2.5
    collection2.add("Montreol"); 
    collection2.add("Atlantic city"); 
    collection2.add("Jersey Citys"); 

    System.out.println("\nA list of cities in collection2:");
    System.out.println(collection2);

   /* Vector<String> c1 = (Vector<String>)(collection1.clone());
    c1.addAll(collection2); // Add all elements in collection2 to c1
    System.out.println("\nCities in collection1 or collection2: ");
    System.out.println(c1);

    c1 = (Vector<String>)(collection1.clone());
    c1.retainAll(collection2);
    System.out.print("\nCities in collection1 and collection2: ");
    System.out.println(c1);

    c1.removeAll(collection2);
    System.out.print("\nCities in collection1, but not in 2: ");
    System.out.println(c1);*/
  }
}