package com.cjc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.servici.StudentServiceI;

@RestController
public class StudentController 
{
	@Autowired 
	StudentServiceI si;
	private static final Logger log =LoggerFactory.getLogger(StudentController.class);
	

}
