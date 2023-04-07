package com.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ ResponseBody ResponseBody가 포함된 컨트롤러 (Json을 내려주는 역할)
public class Lesson01Ex01RestController {

	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>@RestController를 사용해서 String을 리턴해본다.</h3>";
	}
	
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "3535");
		map.put("ccc", "3356");
		map.put("ffff", "66666");
		return map;
	}
	// http://localhost:8080/lesson01/ex01/5
	
	@RequestMapping("/5")
	public Data ex01_5() { // key value가 있는값을 리턴하면 Json화 된다
		Data data = new Data(); //일반 자바 bean , spring bean은 new를 사용하지 않는다
		data.setId(1);
		data.setName("유성용");
		return data;
		
	}
	// http://localhost:8080/lesson01/ex01/6
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_06() {
		Data data = new Data(); // 일반 자바bean (bean = 객체)
		data.setId(1);
		data.setName("유성용");
		
		//return new ResponseEntity<>(data, HttpStatus.OK); //200 OK
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); //500 internal server error
	}
}
