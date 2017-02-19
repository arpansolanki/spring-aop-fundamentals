package com.experientgroup.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAspect {	
	@After("execution(* com.experientgroup.spring.Customer.addCustomer(..))")
	public void adviceMethod() {
		System.out.println("Called advice method after");
	}
}