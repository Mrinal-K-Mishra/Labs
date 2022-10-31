package com.student.daoimpl;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.config.HibernateUtil;
import com.student.dao.StudentDao;
import com.student.entity.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent(Student student) { //creating a method for add student in db
		Student s = new Student();	//creating entity class object 
		Scanner scan = new Scanner(System.in);	//creating scanner class object
		String n;	//declare instances variable
		System.out.println("Enter Student name : ");
		n = scan.next();	//user input
		s.setStudentName(n);	//set the value
		Session session = HibernateUtil.getSession(); //mapping with confiuration
		Transaction t = session.beginTransaction();	//starting transaction
		session.save(s);	//for saving data in db
		t.commit();	//transaction commited
		System.out.println(s.getStudentName()+"'s details successfully inserted "); //print the line
		
	}

}

