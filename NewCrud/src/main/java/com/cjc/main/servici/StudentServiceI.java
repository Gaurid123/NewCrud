package com.cjc.main.servici;


import com.cjc.main.model.Student;


public interface StudentServiceI {


	public void deleteStudentData(int id);

	 public Iterable<Student> getAllData();

	public Student getStudentById(int id);

	


}
