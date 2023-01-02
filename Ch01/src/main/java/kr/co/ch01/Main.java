package kr.co.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("Application.xml");
		Hello bean = (Hello)ctx.getBean("hello");
		
		bean.hello();
	}
}
