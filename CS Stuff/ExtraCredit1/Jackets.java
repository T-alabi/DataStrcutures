public class Jackets extends Product {
    private int heavinessRating; // is the jacket, light, medium or heavy

    
    public Jackets(double price, int heavinessRating) {
        super(price);
        this.heavinessRating = heavinessRating;
    }

    public Jackets(double price) {
        super(price);
    }

    public int compareTo(Jackets o) {
        
        return 0;
    }

    public int getHeavinessRating() {
        return heavinessRating;
    }

    public void setHeavinessRating(int heavinessRating) {
        this.heavinessRating = heavinessRating;
    }
    

    @Override
    public String howToSell() {

        return null;
    }

    @Override
    public boolean isGoodForParties() {

        return false;
    }
    
}
