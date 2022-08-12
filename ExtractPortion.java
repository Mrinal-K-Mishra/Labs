package Lab_session_12th_Aug;
import java.util.ArrayList;
import java.util.List;
public class ExtractPortion {
	
		public static void main(String ...s) {
			ArrayList<String> al = new ArrayList<>();
			// adding elements to the array list
			al.add("Red");
			al.add("Green");
			al.add("Orange");
			al.add("White");
			al.add("Black");
			// printing the elements
			System.out.println(al);
			// subList method will extract a portion from start index to last index 
			List<String> al2 = al.subList(0, 3); // storing the portion which i just extracted to a new list
			// after extraction printing the elements
			System.out.println(al2);
			
			
		}

	}


