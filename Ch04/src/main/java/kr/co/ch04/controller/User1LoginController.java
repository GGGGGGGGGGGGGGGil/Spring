package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.co.ch04.vo.User1VO;

@Controller
public class User1LoginController {
	
	@GetMapping("/user1/login")
	public String login() {
		return "/user1/login";
	}
	
	@PostMapping("/user1/login")
	public String login(Model model, User1VO vo) {
		
		model.addAttribute(vo);
		
		return "/user1/register";
	}
	
	
}
