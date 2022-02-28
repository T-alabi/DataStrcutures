import java.util.ArrayList;
import Homework1.Cat;

public class GenericsTest <E>{
    private ArrayList<E> list = new ArrayList<>(); 

    public void push(E o) {
        list.add(o);
      }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0); // sets the first arraylist in array to smallest integer

        for (int i = 1; i < list.size(); i ++){
            if (min.compareTo( list.get(i) ) > 0){// if min greater than this list element
                min = list.get(i); // this list element is now the new min
            }
        }
        return min;
     } 

     public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(5);
    arr.add(77);
    arr.add(-40);
    arr.add(100);
    arr.add(0);

      System.out.println("\n Minimum Integer: " + min(arr));

    ArrayList<String> str = new ArrayList<>();

    str.add(new String("Z"));
    str.add(new String("B"));
    str.add(new String("C"));
    str.add(new String("A"));
    str.add(new String("E"));

    //String b = new String();
   System.out.println("\n Minimum string: " + min(str));

   ArrayList<Cat> catArr = new ArrayList<Cat>();

   Cat betty = new Cat("betty", 12);
   Cat zeke = new Cat("zeke", 0.5);
   Cat abby = new Cat("abby", 5);
   Cat aaron = new Cat("aaron", 7); 
   Cat cathy = new Cat("cathy", 3);

   catArr.add(betty);
   catArr.add(zeke);
   catArr.add(abby);
   catArr.add(aaron);
   catArr.add(cathy);

        

    System.out.println("\n Minimum Cat Age " + min(catArr).getAge());

     }


}// end class 