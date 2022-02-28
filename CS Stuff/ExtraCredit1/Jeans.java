public class Jeans extends Product {
    private String fit; // is it oversized, fitted, bootcut

    public Jeans(double price) {
        super(price);
    }
    
    public Jeans(double price, String fit) {
        super(price);
        this.fit = fit;
    }

    public int compareTo(Jeans o) {

        return 0;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
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
