package com.DI.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(" com/DI/Autowiring/config.xml");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp1);
	}
}
