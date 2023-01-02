package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class IoCMain {
	public static void main(String[] args) {
		//IoC를 활용안하고 객체 생성
		TV tv1 = new LGTV();
		TV tv2 = new SamsungTV();
		
		tv1.powerOn();
		tv1.ChUp();
//		tv1.SoundUp();
		
		tv2.powerOn();
		tv2.ChUp();
//		tv2.SoundUp();
		
		//IoC 활용
		ApplicationContext ctx = new GenericXmlApplicationContext("Application.xml");
		TV lgtv = (TV)ctx.getBean("lgtv");
		TV stv = (TV)ctx.getBean("stv");
		
		lgtv.powerOn();
		lgtv.ChDown();
		lgtv.SoundUp();
		
		stv.powerOn();
		stv.ChDown();
		stv.SoundDown();
	}
}
