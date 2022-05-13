import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
        Cat one = new Cat(7, "jack");
        Cat two = new Cat(2, "sky");
        Cat three = new Cat(1, "loki");
        //Cat Hashcodes
        Integer oneCatCode = one.hashCode();
        Integer twoCatCode = two.hashCode();
        Integer threeCatCode = one.hashCode(); //on purpose
        //make hashMap
        Map<Integer, Cat> map = new HashMap<>();
        map.put(oneCatCode, one);// hashcode and cat are not connected to eachother in map
        map.put(twoCatCode, two);
        map.put(threeCatCode, three);
        map.put(threeCatCode, three);//on purpose
        //print map
        map.forEach((x,y) -> System.out.println( x + ": " + y ));
        System.out.println("map.containsKey(oneCatCode) - Loki " + map.containsKey(oneCatCode));//check map for loki
        
        Cat newCat = map.get(oneCatCode);// get cat w/ oneCatCode
       // System.out.println("New cat's name is: " + newCat.getName());
      //  System.out.println("New Cats hashcode is: " + newCat.hashCode());
        Integer newCatHashcode = newCat.hashCode();
       // System.out.println("map.containsValue(newCatHashCode): " + map.containsValue(newCatHashcode));
        map.put(newCatHashcode, newCat);

       /* map.forEach((x,y) -> System.out.println(x + " " + y.getName()));
        //now theres a new object created from loki but with a different hashcode
        System.out.println(" map.containsKey(newCatHashCode): " + map.containsKey(newCatHashcode));
        //print keySet
        System.out.println("keySet: " + map.keySet());
        System.out.println("values: " + map.values());
        //removing 2 elements by hashcode 
        map.remove(twoCatCode);
        System.out.println("keySet: " + map.keySet());
        System.out.println("values: " + map.values());*/
        
        ///////////TREE MAPS///////////
        TreeMap<Integer, Cat> treeMap = new TreeMap<>(map);
       /* TreeMap<Integer, Cat> treeMap = new TreeMap<>(map);
        treeMap.forEach((x,y) -> System.out.println(x + " " + y));
        //trying methods
        System.out.println("\ntreeMap.keySet() : " + treeMap.keySet());//returns set of keys contained in map
        System.out.println("\ntreeMap.values() : " + treeMap.values());//returns collection view of values in map
        System.out.println("\ntreeMap.descendingKeySet() : " + treeMap.descendingKeySet());//returns revwerse order 
                                                    //of navigatble set view of keys in the map
                 //least key grrater than or equal to the given key

        System.out.println("\ntreeMap.ceiingEntry(newCatHashCode) : " + treeMap.ceilingEntry(newCatHashcode));
        System.out.println("\ntreeMap.firstKey: " + treeMap.firstKey()); //returns first (lowest) key
        //returns greatest key strickly less than given key, or null if it doesnt exist
        System.out.println("\ntreeMap.lowerKey(newCatHashCode: " + treeMap.lowerKey(newCatHashcode));
        //returns a view of the portion of map whose keys are greater than (or equal to if true is used) from key
        System.out.println("\ntreeMap.tailMap(newCatHashCode, false): " + treeMap.tailMap(newCatHashcode, false));
        //returns true if this map maps one or more keys to the specfic value 
        System.out.println("\ntreeMap.containsValue(three:)"   + treeMap.containsValue(three));*/

        ///LINKEDHASHMAP TETSING/////
        LinkedHashMap<Integer, Cat> linkedHm = new LinkedHashMap<>();
        linkedHm.putAll(treeMap); // adds all from treemap to LinkedHashMap
        linkedHm.forEach((x,y) -> System.out.println(x + " " + y));
        System.out.println("LinkedHashMap.containsValue(loki): "+ linkedHm.containsValue(three));// does it contain the LOKI cat?
        System.out.println("\nget(Object threeCatCode): " + linkedHm.get(threeCatCode));//does it have the key for the third cat LOKI?
        linkedHm.remove(three);//remove cat 3 LOKI
        System.out.println("getOrDefault(Object key, V defaultValue): " + linkedHm.getOrDefault(threeCatCode, three));//cat 3 is now the default value
        System.out.println("keySet(): " + linkedHm.keySet()); // returns view of all keys
        System.out.println("Values(): " + linkedHm.values());//collection view of all values in this map




    }
}
