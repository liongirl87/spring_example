package com.ex.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.lesson03.BO.ReviewBO;
import com.ex.lesson03.model.ReviewReal;

@RequestMapping("/lesson03/ex02")
@RestController
public class Lesson03Ex02RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex02/1
	@RequestMapping("/1")
	public String ex02_1() {
		ReviewReal review = new ReviewReal(); //일반 자바 BEAN
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("바다고양이");
		review.setPoint(3.5);
		review.setReview("혼자먹기 적당하네요");
		
		int rowCount = reviewBO.addReview(review);
		
		return "성공된 행의 개수:" + rowCount;
	}
	
	// http://localhost/lesson03/ex02/1
	@RequestMapping("/2")
	public String ex02_2() {
		int rowCount = reviewBO.addReviewAsField(4, "콤비네이션R", "손오공", 5.0, "너무 맛있당!!");
		return "성공한 행의개수:" + rowCount;
		
	}
	
}
