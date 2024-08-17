package com.cdac.tranning.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.tranning.springcore.model.Book;

public class BookApp {
public static void main(String[] args) {
	ApplicationContext  myContex = new ClassPathXmlApplicationContext("BookConfig.xml");
	Book  book1 =(Book)myContex.getBean("b1");
	book1.display();
	((ClassPathXmlApplicationContext)myContex).close();
}	

}
