public interface Edible {
    public abstract String howToEat(); 
    public default String howToCook(){
        return "when in doubt, boil it!";
    }
}
