package Lab_session_12th_Aug;
import java.util.LinkedList;
public class ReplaceElementOfLinkedList {
		public static void main(String ...args) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(15);
			ll.add(30);
			ll.add(28);
			ll.add(68);
			ll.add(45);
			// before replacing element
			System.out.println(ll);
			ll.remove(); // this method will remove the first element 
			// after replacing element
			System.out.println(ll);
		}


	}


