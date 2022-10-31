package com.student;


import com.student.serviceimpl.StudentServiceImpl;

public class App 	//main class
{
    public static void main( String[] args )	//main method
    {
    	//creating StudentServiceImpl class object
        StudentServiceImpl stservice = new StudentServiceImpl();
        stservice.addStudent(null);	//call the method from service layer
    }
}