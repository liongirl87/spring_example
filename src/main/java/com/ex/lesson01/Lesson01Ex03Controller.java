package com.ex.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // jsp로 뿌릴 때는 무조건 @Controller @ResponseBody 는 String이나 data일경우만 사용
public class Lesson01Ex03Controller {
	
	@RequestMapping("/lesson01/ex03")
	public String ex03() {	// String경우 View(jsp)의 경로 -ResponseBody없이 컨트롤러만 단독사용시
		// @ResponseBody없이 단독 @Controller만 사용되는 경우
		// return String(뷰 경로) ViewResolver에 의해 jsp 경로를 찾는다.
		
		// return "/WEB-INF/jsp/lesson01/ex03.jsp";
		// application.properties에 있는 prefix와 suffix 제외한 경로만 쓴다
		return "lesson01/ex03"; //jsp view경로
	}
}
