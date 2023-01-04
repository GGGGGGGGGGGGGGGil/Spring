package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //컴포넌트 대신 컨트롤러로 사용(컴포넌트 사용해도 괜찮)
public class MainController {
	
	// /Ch04/를 실행하면 index 페이지가 실행되게 함
	@GetMapping(value = {"/", "/index"})
	public String index() {
		return "redirect:/user1/register"; //단순 키워드로 리다이렉트 함
	}
	
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";    // Application.xml에서 prefix, suffix 불러와서
						    // prefix(/WEB-INF/views) + /hello + suffix(.jsp) = 실제경로가 됨
	}
	@GetMapping("/welcome") //RequestMapping의 GET 포함되있음
	public String welcome() {
		return "/welcome";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
}
	
