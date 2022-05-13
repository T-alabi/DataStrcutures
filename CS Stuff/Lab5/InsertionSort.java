import java.text.NumberFormat;

public class InsertionSort {
       /** The method for sorting the numbers */
       public static void insertionSort(int[] list) {
              for (int i = 1; i < list.length; i++) {
                  /** insert list[i] into a sorted sublist list[0..i-1] so that
             list[0..i] is sorted. */
             int currentElement = list[i];
             int k;
         for (k = i - 1; k >= 0 && list[k] > currentElement; k--) { // moves backwards
            list[k + 1] = list[k];
                   }
                // Insert the current element into list[k+1]
                list[k + 1] = currentElement;
                  }
                }

/** A test method */
    public static void main(String[] args) {
      NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);
      float begin, end, time; // we will measure time it took
      int n = 1000000;
      int[] list = new int[n];
      
      //run this 3 times for best and worst results
      for (int p = 0; p < 3; p++){
        ////////

        for (int i = 0; i<n ; i++){
          //random numbers generated for the array
         list[i] = (int)(Math.random()*100*(Math.random()> 0.5?1:-1));
        //System.out.print(list[i] + ", ");
     }

          begin = System.nanoTime();//starting timer before code call
          insertionSort(list);
          
         /* for (int j = 0; j < list.length; j++){
            System.out.print(list[j] + " ");
          }*/
          end = System.nanoTime(); // ending time 
          time = end - begin;
          System.out.println( );
          System.out.println("it took " + myFormat.format(time));
          //list = null;
        }
    }

      }