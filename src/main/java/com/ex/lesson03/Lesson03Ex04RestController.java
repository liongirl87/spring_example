package com.ex.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.lesson03.BO.ReviewBO;

@RestController
public class Lesson03Ex04RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex04?id=22
	@RequestMapping("/lesson03/ex04")
	
	public String ex04(
			@RequestParam("id") int id) {
		reviewBO.deleteReviewById(id);		//행의 갯수를 안받는 CASE <일을 시키기위해!
		return "삭제완료";
		
	}
}
