package Homework1;

/******************************************************************************* * * 
 * Kean University  
*	Spring 2022  
*	Course: CPS*2232 – Data Structures   
*	Author: Oluwatunmise Alabi, 2232, 02  * Homework 1 (or Lab): 1, task 1,  2, 3,   
*	Program Description:  
*************************************************************************/ 



public class Cat implements Comparable<Cat>{
    private String name;
    private double age;
    private Color color;
    private String type;
    private String breed;
    static int numberOfCats;

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void setNumberOfCats(int numberOfCats) {
        Cat.numberOfCats = numberOfCats;
    }
    

    
    //construtors 
    public Cat(){}

    public Cat(String name){
        this.setName(name);
    }

    public Cat(String name, double age, Color color, String type){
        this.setName(name);
        this.age = age;
        this.color = color;
        this.type = type;
    }

    public Cat(String name, String breed){
        this.setName(name);
        this.breed = breed;
        System.out.println(breed);
    }
    public Cat( String name, double age){
        this.setName(name);
        this.age = age;
        
    }
    //methods 
    public static int getNumberOfCats(){
        return numberOfCats;
    }

    String eat(){
        return "favorite food";
    }

    boolean play(String toy){
        return false;
    }
    public char[] compare() {
        return null;
    }
    @Override
    public int compareTo(Cat o) {
        if (this.getAge() > o.getAge())
            return 1;
        else if (this.getAge() < o.getAge())
            return -1;
        else 
            return 0;
    }
    @Override // Implement the toString method in GeometricObject
    public String toString() {
      return "Age: " + this.getAge() + " Age: " + this.getAge() +
        " Color: " + this.getColor() + " Type: " + this.getType();
    }

    
}


