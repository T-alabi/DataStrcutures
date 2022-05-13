import java.util.*;
public class MidermCoding_Practice {
    public static void main(String[] arg){
        //declaring and creating the queue
      Queue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(55);
        q.add(100);
       
        Stack<Integer> s = new Stack<Integer>();//declare stack
       
        s.addAll(q); // add all the elements from priorityQueue to the stack
        Iterator<Integer> iter = s.iterator();
        while(iter.hasNext()){
          System.out.print(s.pop()+ " ");//use pop to print them reversed 
        }
        //////////////////

        //used to add queue integers to array
        Iterator<Integer> iter1 = q.iterator(); // iterator to iterate and add elements
        Integer[] arr = new Integer[5]; // declare array
        ArrayList<Integer> arrList = new ArrayList<>();

        while(iter1.hasNext()){
            for(int i = 0; i < 5; i++){
                arr[i] = q.poll();//add queue elements to arr
                arrList.add(arr[i]);// add them to arrlist here too
            }
        }
        System.out.println("\n\n arrays below ");
        for(int i = arr.length-1; i >=0; i--){  //print array backwards
            System.out.print(arr[i] + " ");
        }
        /////////////LIST
        System.out.println("\n\n arrayList below ");
        for(int i = arrList.size()-1; i>=0; i--){ //print array backwards
            System.out.print(arrList.get(i) + " ");
        }
        
    }
}
