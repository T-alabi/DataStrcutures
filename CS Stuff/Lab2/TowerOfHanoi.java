//import java.util.Scanner; 

public class TowerOfHanoi {
  /** Main method */
  static int count; 
  public static void main(String[] args) {
    // Create a Scanner
   /* Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = scan.nextInt();
    long begin, end, time; //used to measure


    // starting the watch
     begin = System.nanoTime(); //measurement in nano seconds 

    System.out.println("the total number of moves: " + moveDisks(n, 'A', 'B', 'C'));
    end = System.nanoTime();
    time = end-begin;
    
    System.out.println("it took " + time + " nanoseconds to run the tower of Hanoi code for " + n + " disks. " );
    //added code to find the average for me
    scan.close();*/
    int[] a = {10,10,26,49,87};
    int ans = binarySearch(a, 0, a.length-1, 87);
    
    System.out.println("the index is: " + ans);
  }

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static int moveDisks(int n, char fromTower,char toTower, char auxTower) {
        count++;
    if (n == 1) {// Stopping condition
      //System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        //System.out.print(count + " number of moves");
        return count;
    }
        else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      //System.out.println("Move disk " + n + " from " +fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
      return count;
    }
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
else{
  mid = -1;
}

  return mid;
}
static int binarySearch(int arr[], int low, int high, int key)
    {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (high >= low && low <= arr.length - 1) {
 
            int mid = low + (high - low) / 2;
 
            // If the element is present
            // at the middle itself
            if (arr[mid] == key)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, key);
        }
 
        // We reach here when element is not present in
        // array
        return -1;
    }


 
}