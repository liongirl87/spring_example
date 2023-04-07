package com.ex.lesson04.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.lesson04.DAO.StudentMapper;
import com.ex.lesson04.model.Student;

@Service
public class StudentBO {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}

}
