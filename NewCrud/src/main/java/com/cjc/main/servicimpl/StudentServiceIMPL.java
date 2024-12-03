package com.cjc.main.servicimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.servici.StudentServiceI;

@Service
public class StudentServiceIMPL implements StudentServiceI 
{
	@Autowired
	StudentRepository sr;
	private static final Logger log =LoggerFactory.getLogger(StudentServiceIMPL.class);
	@Override

	public Student postdata(Student stu) 
	{
	return sr.save(stu);
		
	}


	public void deleteStudentData(int id) {
		// TODO Auto-generated method stub
		
		sr.deleteById(id);
	}

	public Iterable<Student> getAllData() {
		
		return sr.findAll();
	}
	@Override
	public Student getStudentById(int id) {
		
		return sr.findById(id).get();
	}


	@Override
	public Student putdata(Student s, int id) {
		
		return sr.save(s);
	}
	

}
