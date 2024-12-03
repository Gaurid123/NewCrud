package com.cjc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servici.StudentServiceI;

@RestController
public class StudentController 
{
	@Autowired 
	StudentServiceI si;
	private static final Logger log =LoggerFactory.getLogger(StudentController.class);
	@PostMapping("/studentdatapost")
	public ResponseEntity<Student> poststudentdata(@RequestBody Student stu)
	{
		Student s=si.postdata(stu);
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}
}
	
	


