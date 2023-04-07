package com.ex.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/lesson04/test")
@Controller
public class Lesson04TestController {
	
	//http://localhost/lesson04/test/add_test_view
	@RequestMapping("/add_test_view")
	public String test01_01() {
		return "lesson04/addTest";
	}
	
	@RequestMapping("/add_test")
	public String addTest(@RequestParam("test") String test) {
		return test;
	}
	
	
}
