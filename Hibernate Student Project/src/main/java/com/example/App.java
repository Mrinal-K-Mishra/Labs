package com.example;


import java.util.Scanner;

import com.example.daoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDaoImpl dao = new StudentDaoImpl();	
    	char c;	//declare instances variables
    	do {
    		Scanner sc = new Scanner(System.in);
    		// press key what you want to store
    		System.out.println("Press 1 for add student \nPress 2 for display student \nPress 3 for Update student data \nPress 4 for  Delete student data \nPress 5 for Exit");
    		int choice = sc.nextInt();	//user input
    		switch(choice) {	// switch case to choose the the operation
    		//called a method for add student details
    		case 1: dao.addStudent();
    			break;
    		//called a method for fetch student details
    		case 2: dao.fetchStudent();
    			break;
    		//called a method for update student details 
    		case 3: dao.updateStudent();
    			break;
    		//called a method for delete student details	
    		case 4: dao.deleteStudent();
    		    break;
    		//exit
    		case 5: System.exit(0);
    		    break;
    		//if you given wrong input
    		default: System.out.println("Invalid Choice");
    		}
    		//if you want continue with operation or not
    		System.out.println("Do you want to continue? Y/N");
    		c = sc.next().charAt(0);
    	}while(c == 'y' || c == 'Y');  
    	System.out.println("Thank you.");
    }
}