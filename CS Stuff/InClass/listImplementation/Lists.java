import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	public static void main(String [] args) {
		List<String>  cityList = new ArrayList<>();
	 	cityList.add("London");
	    cityList.add("Denver");
	 
	    List<String>  cityList2 = new LinkedList<>();
	 	cityList2.add("London");
	 	cityList2.add("Denver");
	 	
	 	cityList.forEach(i -> 	System.out.print(i + " "));
	 	System.out.println("\n cityList instanceof List? " + (cityList instanceof List));
	 	cityList2.forEach(i -> 	System.out.print(i + " "));
		System.out.println(", cityList2 instanceof List? " + (cityList2 instanceof List));
	 }
}
    

