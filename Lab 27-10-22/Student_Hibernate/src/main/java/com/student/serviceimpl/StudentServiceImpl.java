package com.student.serviceimpl;


import com.student.dao.StudentDao;
import com.student.daoimpl.StudentDaoImpl;
import com.student.entity.Student;
import com.student.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	// created a StudentDaoImpl class object 
	StudentDao sdao =new StudentDaoImpl(); 

	@Override
	public void addStudent(Student student) {
		sdao.addStudent(student);	// called the method from dao layer

	}

}