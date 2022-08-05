package com;
/*
 * @author Mrinal Kanti Mishra
 * 
 */
	import java.util.*;

	public class TestAblock {	

	    public static void main(String[] args) {	//Main Method
	    	for(int i=1;i>0;i++) {	//loop
	      //Logic
	        try {
	            Scanner s = new Scanner(System.in);	//Creating Scanner object
	            
	            System.out.println("Enter of value x and y :");	
	            //User Input
	            int x = s .nextInt();
	            int y = s .nextInt();
	            
	            System.out.println("Output :" +(x/y));	//Exception Occur
	        } 
	        catch (ArithmeticException e) {		//Exception handling
	            System.out.println("java.lang.ArithmeticException: / by zero");
	        } 
	        catch (InputMismatchException e) {	//Exception handling
	            System.out.println("java.util.InputMismatchException");
	        } 
	    }
	}
	}