package CdacFileHandling;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	int marks;
	String grade;

	public Student(int id, String name, int marks, String str) {
		super();

		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = str;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void display() {
		System.out.println("ID :   " + id);
		System.out.println("NAME:  " + name);
		System.out.println("MARKS: " + marks);
		System.out.println("GRADE: " + grade);
	}
}
