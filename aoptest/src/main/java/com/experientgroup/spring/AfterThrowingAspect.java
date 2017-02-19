package com.experientgroup.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {	
	 @AfterThrowing(
			    pointcut="execution(* com.experientgroup.spring.Customer.addCustomerThrowException(..))",
			    throwing="error")
	public void adviceMethod(JoinPoint joinPoint, Throwable error) {
	    System.out.println("logAfterThrowing() is running!");		
		System.out.println("method name : " + joinPoint.getSignature().getName());
		System.out.println("Method error is : " + error);
		System.out.println("******");
	}
}