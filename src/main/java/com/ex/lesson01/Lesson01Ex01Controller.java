package com.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("lesson01/ex01") //공통된 주소
@Controller //spring bean //RequestMapping과 함께 사용
public class Lesson01Ex01Controller {

	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 리턴되는 값을 통째로 response body에 넣는다
	@RequestMapping("/1")	// 주소(path) 매핑
	public String ex01_1() {
		String text = "예제<br>문자열을 response body에 넣어서 보내는 예제";
		return text;
	}
	
	// http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_02() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 53);
		map.put("포도", 2);
		map.put("망고", 17);
		map.put("딸기", 5);
		// {"사과"=53,....} //java map
		// {"포도":2,"망고":17,"사과":53,"딸기":5} Json String map을 리턴하면 json으로 변환된다.web starter안에 포함된 jackson 라이브러리에 의해
		return map;
	}
}
