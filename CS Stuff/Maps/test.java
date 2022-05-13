import java.util.*;
public class test {
    public static void main(String[] args) {
        String test = null;
       // compressString(test);
    System.out.println(compressString(test));
    }

    public static String compressString(String a){
        String returnString = ""; //this is the stirng we will return at the end of the method
        if (a == null){ 
            return "Null pointer exception!";
        }
        int currentCharCount = 0; // this will count how many times this char comes up in the string

        // lets find how many chars are in this string and put them in a arrayList structure 
        ArrayList<Character> charsInString = new ArrayList<>();
        for (int i = 0; i < a.length(); i ++){
            if (!charsInString.contains(a.charAt(i)) ){
                charsInString.add(a.charAt(i));
            }
        }

        // now that we have an arraylist of all the different chars in the string
        //we can use that arraylist to identify the chars we need to count

        for (Character letter: charsInString){ // for each char in the char Arraylist we made, 
                                                //count how many times it appears in the array
        for (int i = 0; i < a.length(); i ++){
            if(a.charAt(i) == letter){
                currentCharCount++;
            }
        } // we found all of this char in the string, lets add it to the final string
            returnString = returnString + currentCharCount + letter;
            currentCharCount = 0; //reset current char count after each letter
        }
    
        return returnString;
    }
}
