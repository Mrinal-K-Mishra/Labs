package String;

public class SequenceOfLowercaseLetter {  //class
		 
		   public static void main(String[] args) {  //main method
			   
			    System.out.println(match("java_exercises"));
				System.out.println(match("Java_exercises"));
				
		        }

		   public static String match(String text) {  //method
			   if (text.matches("^[a-z]+_[a-z]+$"))  //condition
		                return "Found a match!";
		       else
		                return "Not matched!";
		   }
		}



