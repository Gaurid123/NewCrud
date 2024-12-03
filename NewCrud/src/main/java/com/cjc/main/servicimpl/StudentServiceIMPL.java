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
}
