package pack;
import java.util.Scanner;
	 public interface AdvancedArithmetic {
		int divisorsum(int n);
	}
	 class MyCalculator implements AdvancedArithmetic {
		 public int divisorsum(int n) {
			 int sum = 1;
			 for (int i=2;i<=n;i++) {
				 if (n%i == 0) {
					 sum=sum+i;
				 }
			 }
			 return sum;
		 }
		 class Solution
		 {
			 public static void main(String args[]) {
				 Scanner t=new Scanner(System.in);
				 System.out.print("Enter the number:");
				 int n = t.nextInt();
				 MyCalculator c=new MyCalculator();
				 System.out.println("I implemented:AdvancedArithmetic "+c.divisorsum(n));
			 }
		 }
	 }


