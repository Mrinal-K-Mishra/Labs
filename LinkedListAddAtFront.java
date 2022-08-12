package Lab_session_12th_Aug;
import java.util.LinkedList;
public class LinkedListAddAtFront {
		public static void main(String ...args) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(15);
			ll.add(28);
			ll.add(30);
			ll.add(68);
			ll.add(45);
			// before adding element at front
			System.out.println(ll);
			ll.addFirst(6000); // adding an element(1000) in front of the linked list
			// after adding element at front
			System.out.println(ll);
		}

	}


