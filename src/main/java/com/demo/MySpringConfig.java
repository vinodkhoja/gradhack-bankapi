package com.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.demo"})
public class MySpringConfig {
	@Bean
	public DataSource getDataSource(){
		System.out.println("Data source created");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3307/hsbc_bank?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root123");
        System.out.println("connection done");
        return dataSource;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		System.out.println("here");
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
