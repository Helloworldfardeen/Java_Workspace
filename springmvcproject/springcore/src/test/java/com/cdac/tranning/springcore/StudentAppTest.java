package com.cdac.tranning.springcore;
/*
 +------------------------+
|     ApplicationContext  |
|         (Spring IoC)    |
+-------------------------+
             |
             v
   +---------------------+
   | StudentConfig.xml   |
   |  (Configuration)    |
   +---------------------+
             |
             v
   +----------------------+
   |     Student Object 1 |
   |       (s1)           |
   +----------------------+
             |
             v
   +----------------------+
   |     Student Object 2 |
   |       (s2)           |
   +----------------------+
             |
             v
   +----------------------+
   |   Printing Details   |
   +----------------------+
             |
             v
   +---------------------------+
   |   Close ApplicationContext|
   +---------------------------+
*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.tranning.springcore.model.Student;

/*
 * This is the Code using Dependency Injection using Setter Method...--IOC
 * IOC = inversion of control
 * */
public class StudentAppTest {
public static void main(String[] args) {
	System.out.println("Spring Ioc Approach Of creating of Object --Setter_Injection");
	/*Central interface to provide configuration of spring application
	 * It is responsible for instantiating writing ,configuring & managing life cycle of object
	 * Inversion of control
	 * main use is to manage the life cycle of object 
	 * we are talking about ApplicationContex
	 * 
	 * t
	 * */
	ApplicationContext appcontex = new ClassPathXmlApplicationContext("StudentConfig.xml");
	Student s1 = (Student)appcontex.getBean("stud1");//at runtime these two object will we injected..
	Student s2 = (Student)appcontex.getBean("stud2");//at runtime these two object will be injected..
	System.out.println("************STUDENT DETAILS**************");
	System.out.println("("+s1.getRollNo()+" ,"+ s1.getName()+","+s1.getCollege()+" ,"+s1.getMarks()+")");
	System.out.println("("+s2.getRollNo()+" ,"+ s2.getName()+","+s2.getCollege()+" ,"+s2.getMarks()+")");
	((ClassPathXmlApplicationContext)appcontex).close();
}
}
