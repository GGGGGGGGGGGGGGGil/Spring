package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.CustVO;

@Repository
public class CustDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertCustomer(CustVO vo) {
		mybatis.insert("customer.insertCustomer", vo);
	}
	
	public CustVO selectCustomer(String custId) {
		return mybatis.selectOne("customer.selectCustomer", custId);
	}
	
	public List<CustVO> selectCustomers() {
		return mybatis.selectList("customer.selectCustomers");
	}
	
	public void updateCustomer(CustVO vo) {
		mybatis.update("customer.updateCustomer", vo);
	}
	
	public void deleteCustomer(String custId) {
		mybatis.delete("customer.deleteCustomer", custId);
	}
	
}
