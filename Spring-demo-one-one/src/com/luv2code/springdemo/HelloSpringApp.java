package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container

		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call the methods on the bean

		System.out.println(theCoach.getDailyworkout());

		// close the context

		context.close();

	}

}
