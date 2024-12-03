package com.cjc.main.servici;


import com.cjc.main.model.Student;


public interface StudentServiceI {

	 public Iterable<Student> getAllData();

	public Student getStudentById(int id);

	

}
