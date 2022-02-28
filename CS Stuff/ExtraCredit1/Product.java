import java.util.Arrays;

public abstract class Product implements Comparable<Product>, Saleable{
   
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //constructors 
    public Product(double price) {
        this.price = price;
    }
    public Product(){
    }

    //abstract method
    public abstract boolean isGoodForParties();

    @Override
    public String toString() {
        
        return "product price: " + getPrice() + " Product type: " + getClass() + "\n";
    }
    //compare to by price
    public int compareTo(Product o) {
        if (this.getPrice()> o.getPrice()){
            return 1;
        } else if (this.getPrice() < o.getPrice()){
            return -1;
        }
        return 0;// they are thus equal, so return 0
    }
    
    //generic method(s)
    public static void findMedian(Product[] arr){
        Arrays.sort(arr);// sort array with predefined sort method
        int len = arr.length;
        double median = 0;
        if (len % 2 ==0){//even number
            median = ((
                (arr[len/2]).getPrice() + (arr[(len/2) -1]).getPrice() ) /2);
        } else if(len%2 !=0) {
            median = arr[len/2].getPrice();
        }
        System.out.println("The median price of this product array is:" + median);
    }

    public static void main(String[] args) {
       Jackets j1 = new Jackets(55.34, 4); // really heavy jean jacket 
       Jackets j2 = new Jackets(10.99, 1); // a light cardigan 
       Jeans j3 = new Jeans(35.99, "Oversized");
       Jeans j4 = new Jeans(19.99, "fitted");

       Product[] clothes = {j1, j2, j3, j4}; // populates array with our products
       Arrays.sort(clothes);// sort array with predefined sort method

       //print clothes array
       for (Product e: clothes){
        System.out.println(e.toString());
       }
       findMedian(clothes);
    }

}
