package catClient;

//import java.util.Comparator;

//import java.util.Comparator;

import Homework1.Cat;
//import Homework1.Cat;
import Homework1.Color;

public class TestCat {
    public static void main(String[] args) {
        Cat prince = new Cat();
        Cat betty = new Cat("Betty");
        // adding missing properties to prince and betty
        prince.setName("Prince"); 
        prince.setAge(1);
        prince.setBreed("ToyBob");
        prince.setColor(Color.red);
        prince.setType("domestic");
        /////////////////////////
        betty.setAge(4);
        betty.setBreed("Scottish Straight");
        betty.setColor(Color.black);
        betty.setType("domestic");

        //creating 2 more cats
        Cat meanie = new Cat("meanie", 3, Color.black, "Scottish Straight");
        meanie.setType("ferral");

        Cat puppy = new Cat("Puppy", "ToyBob");
        puppy.setType("domestic");
        puppy.setAge(1);
        puppy.setColor(Color.lavendar);
       
        //creating an array of size 4
        Cat[] catArr = new Cat[4];
        catArr[0] = prince;
        catArr[1] = betty;
        catArr[2] = meanie;
        catArr[3] = puppy; 

        System.out.printf("%-18s%-18s%-18s%-18s%-18s\n", "Cat Name", "Cat Age", "Cat Breed", "Cat Color", "Cat Type");
        //printing cat info
        for(Cat cats: catArr){
            System.out.printf("%-18s%-18s%-18s%-18s%-18s\n", cats.getName(), cats.getAge(), cats.getBreed(), cats.getColor(), cats.getType());    
        }
       
        System.out.println(prince.compareTo(betty));
    }

   
    
}
