
package com.ssafy.hw.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.hw.model.dto.User;

// 이 클래스가 컨트롤러 임을 어노테이션으로 설정, 컴포넌트 스캔을 통해 빈으로 등록
@Controller
public class UserController {
	
	/**
	 * '/' 또는 '/index' 요청이 get 방식으로 들어왔을 때 index로 연결한다.
	 * @return
	 */
	//a태그는 get방식이다
	@GetMapping({"/", "/index" })
	public String showIndex() {
		return "index";
	}
	
	// /**
	//  * '/regist' 요청이 get 방식으로 들어왔을 때 regist로 연결한다.
	//  * @return
	//  */
	 @RequestMapping(value = "/regist", method = RequestMethod.GET)
	 public String showRegistForm() {
	 	return "regist";
	 }

	// /**
	//  * '/regist' 요청이 post 방식으로 들어왔을 때 전달된 User 객체를 regist_result로 연결한다. 
	//  * @param user
	//  * @return
	//  */
	 @PostMapping("/regist")
	 public String doRegist(User user, Model model) {
	 	// 전달할 객체
		if(user.getId()==null || user.getPassword()==null || user.getName()==null || user.getEmail()==null || user.getAge()==0) {
			model.addAttribute("errmsg", "파라미터가 잘 등록되지 않았습니다.");
			return "/error/errorpage";
		}
	 	model.addAttribute("user" , user);
	 	return "/regist_result";
	 }
	
	// /**
	//  * '/list' 요청이 get 방식으로 들어왔을 때 User List를 Model에 담아서 list로 연결한다.
	//  * @return
	//  */
	 //Spring MVC는 리턴타입이 void일 때, 매핑된 경로와 같은 이름의 뷰를 자동으로 찾는다.
	 //따라서 void을 리턴하면서도 해당 뷰로 데이터를 전달할 수 있다.
	 @GetMapping("/list")
	 public void showList(Model model) {
	 	// 아직 DB에 연결하지 않았으므로 임의로 사용자 정보 4개를 생성해서 list에 담아 전달한다.
	 	List<User> list = new ArrayList<User>();
	 	list.add(new User("ssafy1", "1234", "김싸피", "ssafy1@ssafy.com", 26));
	 	list.add(new User("ssafy2", "1234", "박싸피", "ssafy2@ssafy.com", 26));
	 	list.add(new User("ssafy3", "1234", "이싸피", "ssafy3@ssafy.com", 26));
	 	list.add(new User("ssafy4", "1234", "강싸피", "ssafy4@ssafy.com", 26));
		
	 	model.addAttribute("users", list);
	 }
	
	// /**
	//  * '/error/404' 요청이 get 방식으로 들어왔을때 보여줄 페이지
	//  * 매핑된 주소를 처리하는 메서드가 존재하지 않을시 표시할 에러 페이지이다.
	//  */
	 @GetMapping("/error/404")
	 public void showError404() {
	 	// 404 Not Found 처리
	 }
}
