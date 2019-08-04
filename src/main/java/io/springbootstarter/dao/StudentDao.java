package io.springbootstarter.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import io.springbootstarter.bean.Student;

@Mapper
public interface StudentDao {
	
//  @Select("select * from student where name=#{haha_name}")
//  Student findStudentByName(@Param("haha_name") String myname);
	Student findStudentByName(String name);
  
}
