package com.cdac.tranning.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.tranning.springcore.model.Developer;

public class DeveloperApp {
	public static void main(String[] args) {
		ApplicationContext myCOntext = new ClassPathXmlApplicationContext("DevelpConfig.xml");
		Developer d1 = (Developer) myCOntext.getBean("develp1");
		d1.display();
		((ClassPathXmlApplicationContext) myCOntext).close();

	}
}
