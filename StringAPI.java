package String;
import java.util.StringTokenizer;
public class StringAPI {

		public static void main(String[] args) {
			String s1 = "Welcome to Java World";
			System.out.println(s1.charAt(5));
			System.out.println(s1.compareToIgnoreCase("Welcome"));
			System.out.println(s1.concat("-Let us learn"));
			System.out.println(s1.indexOf('a'));
			System.out.println(s1.replace('a','e'));
			System.out.println(s1.substring(4, 10));
			System.out.println(s1.toLowerCase());
			
			
			StringBuffer b = new StringBuffer("This is StringBuffer");
			System.out.println(b.append("This is a sample program"));
			System.out.println(b.insert(21, "Object"));
			System.out.println(b.replace(14, 20, "Builder"));
			System.out.println(b.reverse());
			
			System.out.println("---------------------------------3rd Statement-------------------------------------------------");
			
			parseString();
		}
		

	public static void parseString()
	{
	StringTokenizer st= new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE", "\\");
	System.out.println("Drive:" + st.nextToken() + "\\" + "\n" + "Folders:" +st.nextToken() + "||"
	+  st.nextToken() +  "||" + st.nextToken() + "\n" + "Files:" + st.nextToken());

	}
	}


