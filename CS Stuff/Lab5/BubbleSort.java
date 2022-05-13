import java.text.NumberFormat;

public class BubbleSort {
      /** Bubble sort method */
      public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        
        for (int k = 1; k < list.length && needNextPass; k++) {
          // Array may be sorted and next pass not needed
          needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          needNextPass = true; // Next pass still needed
        }
    }
  }
}
  /** A test method */
  public static void main(String[] args) {

    NumberFormat myFormat = NumberFormat.getInstance();
    myFormat.setGroupingUsed(true);
  float begin, end, time; // we will measure time it took
  //int n = 100000;
  int[] list = {1,1,8,4,0,7,0};
  
  //run this 3 times for best and worst results
  for (int p = 0; p < 3; p++){
    ////////

   /* for (int i = 0; i<n ; i++){
      //random numbers generated for the array
     list[i] = (int)(Math.random()*100*(Math.random()> 0.5?1:-1));
    //System.out.print(list[i] + ", ");
 }*/

      begin = System.nanoTime();//starting timer before code call
    bubbleSort(list);
    end = System.nanoTime(); // ending time 
          time = end - begin;
          System.out.println( );
          System.out.println("it took " + myFormat.format(time));
          //list = null;
}
  }
}