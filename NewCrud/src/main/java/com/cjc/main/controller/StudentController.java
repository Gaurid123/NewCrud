package com.cjc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.servici.StudentServiceI;

@RestController
public class StudentController 
{
	@Autowired 
	StudentServiceI si;
	private static final Logger log =LoggerFactory.getLogger(StudentController.class);
	

	@DeleteMapping("/deletestudentdata/{id}")
	public ResponseEntity<String> deleteData(@PathVariable int id)
	{
		si.deleteStudentData(id);
		return new ResponseEntity<String>("data deleted successfully",HttpStatus.OK);
	}
}
