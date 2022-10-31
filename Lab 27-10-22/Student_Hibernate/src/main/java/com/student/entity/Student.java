package com.student.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {	//entity class
	//declare instances variable
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column(length = 30,nullable = false)
	private String studentName;

	}