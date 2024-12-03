package com.cjc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

	

	@GetMapping("/getStudentAll_Data")
	public ResponseEntity<Iterable<Student>> geStudentData()
	{
		
	Iterable<Student>  stud= si.getAllData();
return new ResponseEntity<Iterable<Student>>(stud,HttpStatus.OK);
	}
	
	
@GetMapping("/getById/{id}")
public ResponseEntity<Student> getStudentById(@PathVariable int id)
{
	 Student stu=si.getStudentById(id);
	 return new ResponseEntity<Student> (stu,HttpStatus.OK);
}


	@DeleteMapping("/deletestudentdata/{id}")
	public ResponseEntity<String> deleteData(@PathVariable int id)
	{
		si.deleteStudentData(id);
		return new ResponseEntity<String>("data deleted successfully",HttpStatus.OK);
	}
	@PatchMapping("/patchDta/{id}")
	public ResponseEntity<Student> patchStudentData(@PathVariable int id,
			                 @RequestBody Student s)
	{
		Student st = si.saveData(id,s);
		return new ResponseEntity<Student>(st,HttpStatus.CREATED);
	}
	
	
}

