package com.example.daoImpl;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.StudentDao;
import com.example.entity.Student;

public class StudentDaoImpl implements StudentDao {	//implementing class
	//creating method for add new student in DB
	public void addStudent() {	
		Scanner sc = new Scanner(System.in);	//creating scanner object
		//declare variables
		String n,d,e;
		long p;
		//user input
		System.out.println("Enter Name : ");
		n = sc.nextLine();
		System.out.println("Enter Department : ");
		d = sc.nextLine();
		System.out.println("Enter Email : ");
		e = sc.nextLine();
		System.out.println("Enter Phone number : ");
		p = sc.nextLong();
		
		Student s = new Student();	//creating object of student class
		//set all data
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		//Get the session factory which created this session & check if the session is still open
		Session session =  HibernateUtil.getSessionFactory().openSession();
		//Begin a unit of work and return the associated Transaction object
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
	}
	//creating method for removing student in DB
	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);  //creating scanner object
		System.out.println("Enter Id : ");	//print the line
		int id = sc.nextInt();	//user input
		//create a object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		//Begin a unit of work and return the associated Transaction object
		Transaction t = session.beginTransaction();
		//identify the student
		Student std1 = session.get(Student.class, id); 
		session.delete(std1);
		System.out.println("Delete Successfully...");
		t.commit();

	}
	//creating method for update student data in DB
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);  //creating scanner object
		System.out.println("Enter Id : ");	//print the line
		int id = sc.nextInt();	//user input
		//create a object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		//Begin a unit of work and return the associated Transaction object
		Transaction t = session.beginTransaction();
		//identify the student 
		Student std = session.get(Student.class, id);
		//want to update phone number
		System.out.println("Enter Phone Number: ");
		Long phone = sc.nextLong();	//user input
		std.setPhone(phone);	//set phone number value
		session.update(std);	//update the data
		System.out.println("Update Successfully...");	//print the line
		t.commit();
		

	}
	//creating method for display the student data
	public void fetchStudent() {	
		Scanner sc = new Scanner(System.in);	//creating scanner object
		int id;	//declare variable
		System.out.println("Enter id: ");	//print the line
		id = sc.nextInt();	//user input for variable
		//create a object from HibernateUtil
		Session session =  HibernateUtil.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);	//identify the student
		//print the student data
		System.out.println("--------Student details------------");
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept()+" "+s1.getEmail()+" "+s1.getPhone());
		System.out.println("-----------------------------------");
	}

}