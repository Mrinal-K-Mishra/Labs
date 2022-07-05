//Creating a class
public class Leapyear 
{
public static void main(String[] args)
 {
    int year = 2000;
    boolean leap = false;
    //check it is leapyear or not
    if (year % 4 == 0) 
	{
      if (year % 100 == 0)
	  {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year."); //to print the statement
    else
      System.out.println(year + " is not a leap year.");  //to print the statement
  }
}