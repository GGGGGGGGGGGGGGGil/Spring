package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.co.ch04.vo.User1VO;

@Controller
public class User1Controller {

	@GetMapping("/user1/register") //GET 요청은 view 출력하는것
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(Model model, User1VO vo) { //String을 자동으로 int로 변환 해줌
		
		model.addAttribute(vo);
		
		return "/user1/result";
	}
}
