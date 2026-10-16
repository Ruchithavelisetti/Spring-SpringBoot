package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDAO;
import com.entity.Student;

public class Application {

	
	public static void main(String[] args) {
		
		
		ApplicationContext  container = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDAO studentDAO = container.getBean("studentDAO", StudentDAO.class);
		
		Student st = new Student(1,"",0);
		
		studentDAO.deleteStudent(st);
		   
	
	}

	private static void update(StudentDAO studentDAO) {
		Student student = studentDAO.getStudent(1);	
		student.setName("Prasad");
		student.setMarks(91);		
		studentDAO.updateStudent(student);
	}

	private static void find(StudentDAO studentDAO) {
		
		Student st  =	studentDAO.getStudent(2);
			
			System.out.println(st);
	}

	private static void insert(StudentDAO studentDAO) {
		
		
		Student st = new Student("Kusuma", 90); // obj for entity
		
		
		studentDAO.saveStudent(st);
	}
}
