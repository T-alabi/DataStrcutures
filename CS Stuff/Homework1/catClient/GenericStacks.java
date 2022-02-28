package catClient;
import java.util.*;
//CLASS CHALLANGE 1
public class GenericStacks <E>{
    private ArrayList<E> list = new ArrayList<>(); 

    public int getSize() {
        return list.size();
      }
    
      public E peek() {
        return list.get(getSize() - 1);
      }
    
      public void push(E o) {
        list.add(o);
      }
    
      public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
      }
    
      public boolean isEmpty() {
        return list.isEmpty();
      }
      
      @Override
      public String toString() {
        return "stack: " + list.toString();
      }
      public static void main(String[] args){
          //INTEGERS 
          GenericStacks<Integer> ints = new GenericStacks<>();
          ints.push(5);
          ints.push(6);
          ints.push(9);

          System.out.println(ints.pop());
          System.out.println(ints.toString());

          //STRINGS
          GenericStacks<String> strs = new GenericStacks<>();
          strs.push("Data structures");
          strs.push("Oluwatunmise");
          strs.push("Alabi");
          strs.push("2231*01");
         


          System.out.println(strs.toString());
          strs.pop();
          System.out.println(strs.peek());
          System.out.println(strs.toString());


          //CATS
          
      }
    }