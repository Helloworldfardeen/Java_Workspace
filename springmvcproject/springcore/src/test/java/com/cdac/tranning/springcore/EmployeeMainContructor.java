package com.cdac.tranning.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.tranning.springcore.model.Employee;

public class EmployeeMainContructor {
public static void main(String[] args) {
	ApplicationContext myContex  = new ClassPathXmlApplicationContext("empConfig.xml");
	Employee e1 = (Employee)myContex.getBean("emp1");
//	e1.display();
	System.out.println(e1.toString());
	((ClassPathXmlApplicationContext)myContex).close();
}
}
