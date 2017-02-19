package com.experientgroup.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {	
	 @AfterReturning(
			    pointcut="execution(* com.experientgroup.spring.Customer.addCustomerReturnValue(..))",
			    returning="returnValue")
	public void adviceMethod(JoinPoint joinPoint, Object returnValue) {
		System.out.println("Called advice method after");
		System.out.println("logAfterReturning() is running!");
		System.out.println("method name : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + returnValue);
		System.out.println("******");
	}
}