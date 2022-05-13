public class randomTests {

    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println( "the max is  " + max);
}

public static void maxDivide(int[] arr){
    //split array into 2 parts
    int midArrIndex = arr.length/2;
    int max1 = arr[0];
    int max2 = arr[midArrIndex];
    for (int i = 1; i< midArrIndex; i++){
        if (arr[i] > max1){
            max1 = arr[i];
        }
    }
    for (int i = midArrIndex +1; i < arr.length; i++){
        if (arr[i] > max2){
            max2 = arr[i];
        }
    }
    if (max1 > max2){
        System.out.println("max = " + max1);
    }else{
        System.out.println("max = " + max2);

    }

}
    public static void main(String[] args) {
        int[] test = {1,2,333,4,677};
        
        System.out.println( );
        max(test);
    }
    
}
