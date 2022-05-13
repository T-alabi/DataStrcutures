import java.util.*;

public class shortSortingMethods{
    public static void main(String[] args) {
        long begin, end;
        //CHECKING .PARALLELSORT AND .SORT
        /*
        int[] a = {33,44,0,1,-10,-100,99};
        int[] b = {33,44,0,1,-10,-100,99};

        long begin = System.nanoTime();//starting timer before code call
        Arrays.parallelSort(a);
        long end = System.nanoTime();
        for(int vals : a){
            System.out.print(vals + " ");
        }
        System.out.println("Time: " + (end - begin));

        long begin1 = System.nanoTime();//starting timer before code call
        Arrays.sort(b);
        long end1 = System.nanoTime();
        for(int vals : b){
            System.out.print(vals + " ");
        }
        System.out.println("Time: " + (end1 - begin1));*/
        System.out.println("Radix sort in Java for 100,000 ints took: "); 

        int[] input = new int[100000];
        for (int i = 0; i<100000; i++){
            input[i] = (int) (Math.random()*100);
        }
       
        begin = System.nanoTime();
        radixSort(input);
        end = System.nanoTime();
        System.out.println(end-begin);
    }
    public static void radixSort(int[] input){//input of valeus in array
        final int RADIX = 10; // declare and initialize bucket 10 buckets w. for loop
        List<Integer>[] bucket = new ArrayList[RADIX]; 
        for (int i = 0; i < bucket.length; i++) {
             bucket[i] = new ArrayList<Integer>(); 
        } 
        
        // sort
         boolean maxLength = false; 
         int tmp = -1, placement = 1; 

         while (!maxLength) { 
             maxLength = true; 
            // split input between lists 
            for (Integer i : input) { 
                tmp = i / placement; 
                bucket[tmp % RADIX].add(i); //assigning digit to bucket based on number position
                if (maxLength && tmp > 0) {
                     maxLength = false;
                 }
            } 
        // empty lists into input array 
        int a = 0; 
        for (int b = 0; b < RADIX; b++) { 
            for (Integer i : bucket[b]) { 
                input[a++] = i; } bucket[b].clear(); 
            } // move to next digit 
            placement *= RADIX; //adjusts placement to increase by 10 for next pass
        }
        
    }
}