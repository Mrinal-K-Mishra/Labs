package Lab_session_12th_Aug;
import java.util.LinkedList;
public class LinkedListAddAtFront {
		public static void main(String ...args) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(19);
			ll.add(46);
			ll.add(35);
			ll.add(98);
			ll.add(55);
			// before adding element at front
			System.out.println(ll);
			ll.addFirst(8000); // adding an element(8000) in front of the linked list
			// after adding element at front
			System.out.println(ll);
		}

	}


