package kr.co.ch03.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))") //모든 반환타입 kr.co.ch03.AOPService 안의 insert로 시작하는 모든 매서드
	public void insertPointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.select*(..))")
	public void selectPointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.update*(..))")
	public void updatePointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.delete*(..))")
	public void deletePointcut() {}
	
	
	@Before("insertPointcut()")
	public void before1() {
		System.out.println("횡단관심(부가기능) - before1...");
	}
	
	@Before("selectPointcut()") //포인트컷 실행되기전에 이것먼저 실행해라
	public void before2() {
		System.out.println("횡단관심(부가기능) - before2...");
	}
	
	@Before("updatePointcut()")
	public void before3() {
		System.out.println("횡단관심(부가기능) - before3...");
	}
	
	@Before("deletePointcut()")
	public void before4() {
		System.out.println("횡단관심(부가기능) - before4...");
	}
}
