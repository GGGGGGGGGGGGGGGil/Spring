package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.CustDAO;
import kr.co.bookstore.vo.CustVO;

@Service
public class CustomerService {

	@Autowired
	private CustDAO dao;
	
	public void insertCustomer(CustVO vo) {
		dao.insertCustomer(vo);
	}
	
	public CustVO selectCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	
	public List<CustVO> selectCustomers() {
		return dao.selectCustomers();
	}
	
	public void updateCustomer(CustVO vo) {
		dao.updateCustomer(vo);
	}
	
	public void deleteCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
	
}
