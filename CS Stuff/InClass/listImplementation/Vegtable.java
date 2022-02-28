public abstract class Vegtable implements Comparable<Vegtable>, Edible  {
    private double price; 

    //default constructor
    Vegtable(){
    }
    // other constructor 
    Vegtable(double price){
        this.price = price;
    }

    //abstract method
    public abstract boolean isGoodForSalad();

   

//getters and setter

public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price = price;
}

    @Override
    public String toString() {
        return "price: " + this.price;
    }

     // generic findMin 
     public static <E extends Comparable<E>> void min(E[] list) {
        E min = list[0]; // sets the first arraylist in array to smallest integer

        for (int i = 1; i < list.length; i ++){
            if (min.compareTo( list[i] ) > 0){// if min greater than this list element
                min = list[i]; // this list element is now the new min
            }
        }
        
        System.out.println("the min object: " + min);
     }  

    

    public static void main(String[] args){
        Vegtable[] veggies = new Vegtable[4];
        Broccli b1 = new Broccli(0.20);
        Broccli b2 = new Broccli(0.10);
        TunmisesVeggie t1 = new TunmisesVeggie(1.11);
        TunmisesVeggie t2 = new TunmisesVeggie(4.44);
        veggies[0] = b1;
        veggies[1] = b2;
        veggies[2] = t1;
        veggies[3] = t2;

        for (Vegtable v : veggies){
            System.out.println(v.toString());
        }

        min(veggies);
    }

}
class Broccli extends Vegtable{

    Broccli(){

    }
    Broccli(double price){
        super(price);
    }

    @Override
    public int compareTo(Vegtable o) {
        if (this.getPrice() > o.getPrice())
        return 1;
    else if (this.getPrice() < o.getPrice())
        return -1;
    else 
        return 0;
    }

    @Override
    public String howToEat() {
        return "Boil me first, then chomp away";
    }

    @Override
    public boolean isGoodForSalad() {
        return true;
    }

}

class TunmisesVeggie extends Vegtable{
    private boolean isRipe; 

    //getter and setter

    public TunmisesVeggie(double price) {
        super(price);
    }
    public boolean getIsRipe(){
        return isRipe;
    }
    public void setIsRipe(boolean isRipe){
        this.isRipe = isRipe;
    }
    @Override
    public int compareTo(Vegtable o) {
        if (this.getPrice() > o.getPrice())
        return 1;
    else if (this.getPrice() < o.getPrice())
        return -1;
    else 
        return 0;
    }

    @Override
    public String howToEat() {
        return "bake or fried";
    }

    @Override
    public boolean isGoodForSalad() {
        return false;
    }

}
