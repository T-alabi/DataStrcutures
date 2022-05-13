//import java.lang.*;
import java.util.Arrays;

public class Searches {
//print the results of searches in this main method

static int count;

public static void main(String[] args){
   //LINEAR SEARCH TESTING//
   /*
    final int KEY = 150;
    //int rantimes = 0;
    int n = 10000000;
    int[] list = new int[n];
    long begin, end, time, sum; //used to measure
    sum = 0;
    
    //for loop to do calculations 

    for (int j = 0; j< 5; j++){

        for (int i = 0; i<n ; i++){
            //random numbers generated for the array
           list[i] = (int)(Math.random()*100*(Math.random()> 0.5?1:-1));
          //System.out.print(list[i] + ", ");
       }
        //starting the watch
    begin = System.nanoTime(); //measurement in nano seconds 
    System.out.println( "\n"+linearSearch(list, KEY));
    end = System.nanoTime();
    time = end-begin;
    
    System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY + " on the array of " + n + " elements.");
    //added code to find the average for me
 
    sum = sum + time;
    long avg = (long)sum/5;
    System.out.println("sum: " +sum+ " , average: " + avg );

    }*/
   // int[] a = {9,7,3,4,99,6};
    //int ans = RecursiveLinearSearch(a, 8);
    //System.out.println(ans);

    // RECURSIVE LINEAR SEARCH TESTING//
   
    
    final int KEY = 1;
    //int rantimes = 0;
    int n = 10;
    int[] list = new int[n];
    long begin, end, time, sum; //used to measure
    sum = 0;
    
    //for loop to do calculations 

    for (int j = 0; j< 5; j++){

        for (int i = 0; i<n ; i++){
            //random numbers generated for the array
           list[i] = (int)(Math.random()*100*(Math.random()> 0.5?1:-1));
          Arrays.sort(list);
             System.out.print(list[i] + ", ");

       }
        //starting the watch
    begin = System.nanoTime(); //measurement in nano seconds 
    System.out.println( "\n"+recursiveBinarySearch(list, KEY, 0, list.length-1));
    end = System.nanoTime();
    time = end-begin;
    
    System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY + " on the array of " + n + " elements.");
    //added code to find the average for me
 
    sum = sum + time;
    long avg = (long)sum/5;
    System.out.println("sum: " +sum+ " , average: " + avg );

    }
  
}

public static int linearSearch(int[] arr, int key){
    //search array
    for(int i = 0; i < arr.length; i++){
        //if key is in the array return index
        if (key == arr[i]){
            return i;
        }
    }
    //item not found
    return -1;
}
  
public static int RecursiveLinearSearch(int[] arr, int key){
    count++; // keep count of how many times we do this!

   //array must be greater than 0 to find key, if not, than key isn't present 
   if(arr.length <= 0){
       return -1;
   }
   if (arr[0] == key){ // if the first element in array is = key, return index
       return count-1;
   }
   //make a new array of size-1 to shrink array then copy it to a new one
   int[] newArr = new int[(arr.length)-1];
   // if none of these work, recursivly call array until array is done
   System.arraycopy(arr, 1, newArr, 0, newArr.length);
   return RecursiveLinearSearch(newArr, key);
    
}

public static int recursiveBinarySearch(int[] sortedArr, int key, int low, int high){
    int mid = (int)((low+high)/2);
    if (high >=low && low<=sortedArr.length-1){
    
    if (sortedArr[mid] == key ){
      return mid;
    }
    else if(sortedArr[mid] < key ){
      recursiveBinarySearch(sortedArr, key, mid+1, high);
    }
    else if((sortedArr[mid] > key )){
      recursiveBinarySearch(sortedArr, key, low, mid-1) ;
    }
    }
   
    
      return -1;
    }


    public class BubbleSortExample {
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }

        }
    }


   
}//end class
