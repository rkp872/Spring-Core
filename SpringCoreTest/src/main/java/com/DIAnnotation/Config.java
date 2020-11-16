package com.DIAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.DIAnnotation")
public class Config 
{
	@Bean(name = "lappy")
	public Laptop getLaptop()
	{
		Laptop laptop=new Laptop();
		laptop.setLid(701);
		laptop.setBrand("Macbook");
		laptop.setOs("Mac");
		laptop.setProcessor("intel core i7");
		laptop.setRam("16GB");
		laptop.setPrice(94000);
		return laptop;
	}
}
