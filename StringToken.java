package String;
public class StringToken {                     
	    public static void main(String[] args) {          //invoking main method
	        String a6 = "Welcome to Java World";           //creating obj.
	        System.out.println(a6.charAt(5));              //printing 5th position character
	        System.out.println(a6.compareToIgnoreCase("Welcome")); //string comparison 
	        System.out.println(a6.concat("::Let us Learn")); //concatenating
	        System.out.println(a6.indexOf('a'));
	        System.out.println(a6.replace('a', 'e'));      //replacing a to e
	        System.out.println(a6.substring(4, 10));       //indexing from 4 to 10
	        System.out.println(a6.toLowerCase());          //converting string to Lowercase
	    }
	}


