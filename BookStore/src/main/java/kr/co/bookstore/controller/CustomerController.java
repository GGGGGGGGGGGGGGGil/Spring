package kr.co.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.CustomerService;
import kr.co.bookstore.vo.CustVO;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	

	@GetMapping("/customer/list")
	public String list(Model model) {
		
		List<CustVO> Customers = service.selectCustomers();
		
		model.addAttribute("Customers", Customers);
		
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	
	@PostMapping("/customer/register")
	public String register(CustVO vo) {
		service.insertCustomer(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/modify")
	public String modify(Model model, String custId) {
		
		CustVO customers = service.selectCustomer(custId);
		model.addAttribute("customers", customers);
		
		return "/customer/modify";
	}
	
	
	@PostMapping("/customer/modify")
	public String modify(CustVO vo) {
		
		service.updateCustomer(vo);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String delete(String custId) {
		
		service.deleteCustomer(custId);
		
		return "redirect:/customer/list";
	}
	
}
