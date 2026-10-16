package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entity.Student;
import jakarta.transaction.Transactional;


@Transactional
@Component
public class StudentDAO {
	
	@Autowired	
	SessionFactory sessionFactory ;  // has a

	
	public Session getSession() {
		
		Session session = sessionFactory.getCurrentSession();	
		
		return session;
		
	}
	
	 public void saveStudent(Student student) {
		
		
			Session session = getSession();
		
	     	session.persist(student);	
	}	

	
	 public  Student getStudent(int id) {
		
		
		Session session = getSession();		
		Student student = session.find(Student.class,id);
		
		return student;
		
	}
	 
	 
	 public void updateStudent(Student student) {
		 
		 Session session = getSession();
		 
		 session.merge(student);
		 
		 System.out.println("updating....");
		 
	 }
	 
	 public void deleteStudent(Student student) {
		 
		 Session session = getSession();
		 
		 session.remove(student);
		 
		 System.out.println("Deleted.....");
		 
	 }
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
