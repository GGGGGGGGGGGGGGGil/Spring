package kr.co.ch03;

import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/01/03
 * 이름 : 길은섭
 * 내용 : 스프링 AOP 실습하기
 */

public class AOPMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("Application.xml");
		AOPService service = (AOPService) ctx.getBean("AOPService"); //컴포넌트 이름 지정안하고 클래스 이름가능
		
		System.out.println("=======================");
		service.insert();
		
		System.out.println("=======================");
		service.select();
		
		System.out.println("=======================");
		service.update();
		
		System.out.println("=======================");
		service.delete();
		
		System.out.println("=======================");
	}
}
