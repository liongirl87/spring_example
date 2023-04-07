package com.ex.lesson04.DAO;

import org.springframework.stereotype.Repository;

import com.ex.lesson04.model.Student;

@Repository
public interface StudentMapper {
	
	public void insertStudent(Student student); //1개 이기때문에 param으로 감쌀 필요가없다
	
	public Student selectStudentById(int id);
}
