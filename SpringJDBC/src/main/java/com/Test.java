package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {
	public static void main(String[] args) {
		
		
		
		ApplicationContext container= new ClassPathXmlApplicationContext("beans.xml");

		JdbcTemplate template = container.getBean("template", JdbcTemplate.class);
		
		
		List<Employee> list = template.query("select * from employee", (rs, rowNum)-> new  Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		
		System.out.println(list);
	}




	private static void usingLambda(JdbcTemplate template) {
		//using lambda
		
		Employee employee = template.queryForObject("select * from employee where id = 1", (rs, rowNum)-> new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
				
				System.out.println(employee);
	}




	private static void selectAll(ApplicationContext container) {
		
		
		JdbcTemplate template = container.getBean("template", JdbcTemplate.class);
		
		List<Employee> query = template.query("select * from employee", new  RowMapper<Employee>() {

						@Override
						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
							
							
							return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
						
						}
				
				}); 																	
				
				System.out.println(query);
	}




	private static void seelctOne(JdbcTemplate template) {
		
		
		
		//anonymous inner clss
		
		Employee emp = 	template.queryForObject("select * from employee where id =1 ", new  RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			
			}
	
	});
				
				System.out.println(emp);
	}
	
	
	

	private static void dml(ApplicationContext container) {
	
		
		JdbcTemplate template1 = container.getBean("template", JdbcTemplate.class);
		 
     // 1. Insert with placeholders
		 
		 
//   template.update("insert into employee values(?,?,?)" ,			                 1,"Ruchi",30000 );
   

// 2. Insert without placeholders
   
 //  template.update("insert into employee values( 2,'Rushi',40000 )");

   
   template1.update("update employee set salary = ? where id = ? " , 50000, 1);
   
   template1.update("delete from employee where id =2");
   System.out.println("inserted");
   
	
   
	}

}
