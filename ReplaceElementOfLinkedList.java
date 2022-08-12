package Lab_session_12th_Aug;
import java.util.LinkedList;
public class ReplaceElementOfLinkedList {
		public static void main(String ...args) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(19);
			ll.add(53);
			ll.add(26);
			ll.add(98);
			ll.add(55);
			// before replacing element
			System.out.println(ll);
			ll.remove(); // this method will remove the first element 
			// after replacing element
			System.out.println(ll);
		}


	}


