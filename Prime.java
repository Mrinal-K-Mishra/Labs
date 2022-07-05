import java.util.Scanner;
//Creating a class
public class Prime
{    
 public static void main(String args[])
 {    
  int i,p=0,f=0;   
    Scanner sc=new Scanner(System.in); //get input from user
	System.out.print("Enter the number :");
	int n=sc.nextInt();  
      
  p=n/2;      
  if(n==0||n==1)
  {  
   System.out.println(n+" is not prime number");   //to print the statement   
  }
  else
  {  
   for(i=2;i<=p;i++)
   {      
    if(n%i==0)
	{      
     System.out.println(n+" is not prime number");     // to print the statement
     f=1;      
     break;      
    }      
   }      
   if(f==0) 
   {
   System.out.println(n+" is prime number");  //to print the statement
   }  
  }  
}    
}
