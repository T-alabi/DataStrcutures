public interface Saleable  {
    public abstract String howToSell(); 
    public default String howToMarket(){
        return "post me on instagram with your favoite hashtags!";
    }
   }