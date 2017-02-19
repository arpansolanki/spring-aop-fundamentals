package com.experientgroup.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
	@Around("execution(* com.experientgroup.spring.Customer.addCustomer(..))")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Before around");
		try {
			proceedingJoinPoint.proceed(); //dofilter()
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After around");
	}
}
