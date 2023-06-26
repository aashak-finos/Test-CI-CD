//package com.example.demo;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoSettings;
//import org.mockito.quality.Strictness;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
//import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//@Configuration
////@WebAppConfiguration
////@ComponentScan(basePackages = "com.example.demo")
////@ExtendWith(MockitoExtension.class)
////@MockitoSettings(strictness = Strictness.LENIENT)
////@SpringBootTest(classes = JpaApplicationTests.class)
//public class Config {
//	  @Bean
//	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//	        // Configure and create the entityManagerFactory bean
//	        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//	        // Set the necessary properties, such as dataSource, persistenceUnitName, etc.
//	        // ...
//	        return entityManagerFactoryBean;
//	    }
//
//	    // Other necessary beans and configurations for JPA
//	    // ...
//	}
//	
//	
//	
