package com.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ex.lesson04.BO.StudentBO;
import com.ex.lesson04.model.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;
	
	//	http://localhost/lesson04/ex02/add_student_view
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
//	http://localhost/lesson04/ex02/add_student
	@PostMapping("/add_student")
	public String addStudent(
			// name 속성의 파라미터명과 일치하는 필드에 값이 들어간다
			@ModelAttribute Student student,Model model) {
		// DB insert
		studentBO.addStudent(student);
		
		
		// DB select	- 지금 가입한사람(마이바티스가 id를 가져올수있다)
		Student latestStudent = studentBO.getStudentById(student.getId());
		
		// Model에 데이터를 담는다
		model.addAttribute("result", latestStudent);
		model.addAttribute("title", "최근 가입된 학생 정보");
		
		
		// 추가된 학생 정보를 보여주는 jsp
		
		return "lesson04/afterAddStudetn";
	}
	
	
}
