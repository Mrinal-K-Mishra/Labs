package Lab_session_12th_Aug;
import java.util.ArrayList;
public class CompareArrayList {
		public static void main(String ...s) {
			ArrayList<String> al = new ArrayList<>();
			al.add("Red");
			al.add("Green");
			al.add("Black");
			al.add("White");
			al.add("Pink");
			System.out.println(al);
			ArrayList<String> al2 = new ArrayList<>();
			al2.add("Red");
			al2.add("Green");
			al2.add("Black");
			al2.add("Pink");
			System.out.println(al2);
			
			if(al.equals(al2))
				System.out.println("Both the array list are equal");
			else
				System.out.println("Array list are not equal");
			
		}

	}


