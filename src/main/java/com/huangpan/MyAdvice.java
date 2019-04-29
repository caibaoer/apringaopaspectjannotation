package com.huangpan;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice   {
	
	//@Before("execution(* com.huangpan..*.*(..))")
	public void mybefor(JoinPoint jp) {
		System.out.println("前...");
	}
	//@After("execution(* com.huangpan..*.*(..))")
	public void myafer(JoinPoint jp) {
		System.out.println("后...");
	}
	@Around("execution(* com.huangpan..*.*(..))")
	public Object  myaround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		//手动执行目标方法
		Object obj = joinPoint.proceed();
		System.out.println("后");
		return obj;	
	}
}
