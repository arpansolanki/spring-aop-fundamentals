package com.experientgroup.spring;

import org.springframework.stereotype.Component;

@Component
public class Product {
	public void callme() {
		System.out.println("called target method");
	}
}
