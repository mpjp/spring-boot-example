package io.springbootstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springbootstarter.bean.Student;
import io.springbootstarter.dao.StudentDao;

@Service
public class StudentService {
 
  @Autowired
  private StudentDao studentDao;
  
  public Student selectStudentByName(String name) {
	  return studentDao.findStudentByName(name);			  
  }
  
}
