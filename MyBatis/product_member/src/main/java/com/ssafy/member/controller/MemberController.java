package com.ssafy.member.controller;
//소연이 바보
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.service.MemberService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class MemberController {
	
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@GetMapping("/goJoin")
	public String goJoin() {
		return "user/join";
	}
	
	@PostMapping("/join")
	public String join(@RequestParam("id") String id,
			@RequestParam("pw") String pwd,
			@RequestParam("name") String name) {
		MemberDto memberDto = new MemberDto();
		
		memberDto.setId(id);
		memberDto.setPwd(pwd);
		memberDto.setName(name);
		
		memberService.joinMember(memberDto);
		
		return "redirect:/user/goLogin";
	}
	
	@GetMapping("/goLogin")
	public String goLogin() {
		return "user/login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam Map<String, String> map, Model model,
			@RequestParam(name = "remember", required = false) String remember,
			HttpServletResponse response,
			HttpSession session) {
		MemberDto memberDto = memberService.loginMember(map);
		
		if(memberDto != null) {
			session.setAttribute("userinfo", memberDto);
			
			Cookie cookie = new Cookie("person_id", map.get("id"));
			cookie.setPath("/");
			if("ok".equals(remember)) {
				cookie.setMaxAge(60*60*24*365*40);
			}else {
				cookie.setMaxAge(0);
			}
			response.addCookie(cookie);
			return "redirect:/";
		} else {
			model.addAttribute("msg", "아이디 또는 비밀번호를 확인해주세요");
			return "user/login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
