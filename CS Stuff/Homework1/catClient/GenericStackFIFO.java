package catClient;
import java.util.*;
//CLASS CHALLANGE 2

public class GenericStackFIFO<E> {
    private ArrayList<E> list = new ArrayList<>(); 

    public int getSize() {
        return list.size();
      }
    
      public E peekFIFO() {
        return list.get(getSize() - 1);
      }
    
      public void pushFIFO(E o) {
        list.add(o);
      }
    
      public E popFIFO() {
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
          strs.push("first");
          strs.push("Second");
          strs.push("Third");

          System.out.println(strs.pop());
          System.out.println(strs.toString());
          
          
      }
    
    
}
