package com.experientgroup.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AoptestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AoptestApplication.class, args);	
		
		Customer customer = context.getBean(Customer.class);
		//customer.addCustomer();
		try{
		customer.addCustomerThrowException();
		}catch(Exception e){
			
		}
	}
}
