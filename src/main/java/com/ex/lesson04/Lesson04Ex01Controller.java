package com.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ex.lesson04.BO.UserBO;
import com.ex.lesson04.model.User;

@RequestMapping ("/lesson04/ex01")
@Controller	// return String => jsp view를 찾아준다 //String은 jsp의 경로가 된다
public class Lesson04Ex01Controller {

	@Autowired
	private UserBO userBO;
	// http://localhost/lesson04/ex01/add_user_view /view로 끝나면 jsp로 가는것!
	
	@RequestMapping(path="/add_user_view" , method=RequestMethod.GET) // path를 쓰면 getmethod
	public String addUserView() {
		// /WEB-INF/jsp/lesson04/addUser.jsp
		
		return "lesson04/addUser"; //	view경로를 리턴한다
	}
	
	// 405error : method불일치
	// http://localhost/lesson04/ex01/add_user <-데이터 처리를 하는 주소 //get을 허용하지 않기위해 RequestMapping은 get허용
	@PostMapping("/add_user") //포스트 방식으로만 허용
	public String addUser( //name들이 넘어온다
						@RequestParam("name") String name,
						@RequestParam("yyyymmdd") String yyyymmdd,
						@RequestParam(value="email", required=false) String email, //비필수 파라미터 requerd 는 기본값 true
						@RequestParam(value="introduce", required=false) String introduce) {
		
		// insert DB // User UserMapper userMapper User
		userBO.AddUser(name, yyyymmdd, email, introduce);
		
		// 결과 jsp view <-가장먼저 check 인서트전에
		return "lesson04/afterAddUser";
		
	}
	// http://localhost/lesson04/ex01/get_latest_user_view
	@GetMapping("/get_latest_user_view") //화면이면 겟 메핑 모두 다 는 RequestMapping
	public String getLatestUserView(Model model) {
		// 가장 최근에 가입된 사람 1명 select DB
		User user = userBO.getLatestUser();
		model.addAttribute("user", user);	//뒤에가 객체명과 통일되어야한다 앞에""는 아무거나 상관없음
		model.addAttribute("title","회원정보");
		return "lesson04/getLatestUser";
	}
	
}
