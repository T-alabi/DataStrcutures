import java.util.*;
public class TestTreeSet {
    public static void main(String[] args){
        TreeSet<Cat> treeSet2 = new TreeSet<Cat>();
        Cat jack = new Cat(7, "Jack");
        Cat loki = new Cat(1, "Loki");
        Cat sky = new Cat(2, "Sky");
        treeSet2.add(jack);
        treeSet2.add(loki);
        treeSet2.add(sky);
       // treeSet2.forEach(i -> System.out.println(i));
      // System.out.println("\nJack compared to loki: " + jack.compareTo(loki));
        //System.out.println("Jack compared to jack: " + jack.compareTo(jack));


       /* //methods from sorted set interface
        System.out.println("first(): " + treeSet2.first());//lowest element
        System.out.println("last(): " + treeSet2.last());//highest 
        System.out.println("headset for Loki: " + treeSet2.headSet(loki));//returns portion of elements STRICKTLY LESS THAN element
        System.out.println("tailSet for loki: " + treeSet2.tailSet(loki));//returns portion greater than or equal to ELEMENT

        //methods from navigatable set interface
        System.out.println("lower for loki: " + treeSet2.lower(loki).getName());//retuns greatest element less than it (loki)
        System.out.println("floor for loki:" + treeSet2.floor(loki).getName());//greatest element less than or equal to it
        System.out.println("ceiling for loki:" + treeSet2.ceiling(loki).getName());//returns leat element greater than or equal to it / null
        //System.out.println("higher than loki: " + treeSet2.higher(loki).getName());// returns lowest element greater than it (loki)
        System.out.println("pollFirst(): " + treeSet2.pollFirst().getName());//Retrieves and removes lowest elmeent, or null if empty 
        System.out.println("pollLast(): " + treeSet2.pollLast().getName());//Retrieves and removes highest element
        */
        //LINKED HASHSET TESTING
        LinkedHashSet<Cat> linkedHashs = new LinkedHashSet<Cat>();
        linkedHashs.add(jack);
        linkedHashs.add(loki);
        linkedHashs.add(sky);
        linkedHashs.forEach(i -> System.out.println(i));
        linkedHashs.forEach(i -> System.out.print(" " + i.hashCode()));
    }
}
