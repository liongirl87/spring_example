package com.ex.lesson03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.lesson03.model.Review;

@RestController
public class Lesson03Ex01RestController {
	
//	@Autowired
//	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex01?id=5
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id //필수 파라미터 (한개만 받을떈 value를 안써도 된다
			// @RequestParam(value="id") int id) {	//필수 파라미터
			// @RequestParam(value="id" , required=true) int id //필수파라미터
			// @RequestParam(value="id", required=false) Integer id // 비필수 파라미터 (null 이 올수있으니 Integer로 한다)
			// @RequestParam(value="id", defaultValue="1") int id	// 비필수이면서 디폴트값은 1
			) {
		//return reviewBO.getReview(id); //list->JSON
		return null;
	}

	
}
