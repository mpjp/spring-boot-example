package io.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springbootstarter.bean.Student;
import io.springbootstarter.service.StudentService;

@RestController
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/query")
	public Student testQuery() {
		return studentService.selectStudentByName("ingrid");
	}
}
