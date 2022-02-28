public class recur1 {

   public static int f(int N)
{
 int count, sum = 0;
 for (count = 0; count <= N; count++)
 sum = sum + count;
 return sum;
} 
int count, sum = 0;
public static int fRecur(int N){

    if (N == 0){
        return 0;
    }
    if (N==1){
        return 1;
    } else{
        return N + fRecur(N-1);
    }

}
    public static void main(String[] args) {
        //f(3);
        System.out.println(f(4));
        System.out.println(fRecur(4));
    }
    
}
