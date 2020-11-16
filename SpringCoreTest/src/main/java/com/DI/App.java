package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/DI/config.xml");
        Book book=context.getBean("book",Book.class);
        System.out.println(book);
    }
}
