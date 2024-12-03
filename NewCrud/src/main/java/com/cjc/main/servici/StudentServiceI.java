package com.cjc.main.servici;


import com.cjc.main.model.Student;

import com.cjc.main.model.Student;


public interface StudentServiceI {

	public Student postdata(Student stu);


	public void deleteStudentData(int id);

	 public Iterable<Student> getAllData();

	public Student getStudentById(int id);


	public Student putdata(Student s, int id);



}
