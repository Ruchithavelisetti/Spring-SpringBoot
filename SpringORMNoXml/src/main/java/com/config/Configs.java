package com.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= "com")
@EnableTransactionManagement

public class Configs {
	
	//sessionfactory -> interface , bean creation for child 
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		DataSource datasource = datasource();
		
		sf.setDataSource( datasource );
		sf.setPackagesToScan("com");
		sf.setHibernateProperties(properties());
		
		return sf;
	}
	
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl("jdbc:mysql://localhost:3306/springorm");
		dmds.setUsername("root");
		dmds.setPassword("Ruchitha@2001");
		return dmds;		
		
	}
	
	@Bean  // Properties is java class , and it is field of localsession 
	public Properties properties() {
		
		Properties props = new Properties();		
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.show_sql","true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return props;
		
	}
	
	//TransactionManager - interface --> child HibernateTransactionManager
	
	@Bean
	public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager  tm = new   HibernateTransactionManager( sessionFactory);
			return tm;
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
