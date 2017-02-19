package com.experientgroup.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {	
	@Before("execution(* com.experientgroup.spring.Customer.addCustomer(..))")
	public void adviceMethod() {
		System.out.println("Called advice method before");
	}
}
