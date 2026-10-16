package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class Configs {
	
	@Bean
	public JdbcTemplate jdbcTemplates() {
		
		
	DataSource dataSource = dataSource(); //  call datasource
	/*
	JdbcTemplate  template = new JdbcTemplate();  using seeter to inject
	
	template.setDataSource(dataSource);
		
		*/
		return  new JdbcTemplate(dataSource);  //constructor to inject 
		
	}
	
	
	
	public DataSource dataSource() {	// Datasource -> Interface	
		
		DriverManagerDataSource dmds  = new DriverManagerDataSource(); // Object creation for child 
		
		dmds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dmds.setUsername("root");
		dmds.setPassword("Ruchitha@2001");
		
		return dmds;
	}

}
