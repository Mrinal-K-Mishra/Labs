/*
@Author Mrinal Kanti Mishra
*/

//Java Program to get a input from user

import java.util.*;


class GetInput{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in); //using a standard input stream
		System.out.println("Type your name...");
		String name = scan.nextLine(); //taking input from user
		
		
		//output
		System.out.println("Have a nice day " + name);
	}
}