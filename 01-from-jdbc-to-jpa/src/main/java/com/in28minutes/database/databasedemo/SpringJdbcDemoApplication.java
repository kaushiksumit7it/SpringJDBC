package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJbdcDao;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {}", dao.findAll());
		
		logger.info("User id 10001 -> {}", dao.findById(10001));
		
		logger.info("Deleting 10002 -> No of Rows Deleted - {}", 
				dao.deleteById(10002));
		
		logger.info("Inserting 10004 -> {}", 
				dao.insert(new Person(10004, "Tara1", "Berlin1", new Date())));
		
		logger.info("Update 10003 -> {}", 
				dao.update(new Person(10005, "Piete1r", "Utrecht1", new Date())));
		
		
		logger.info("Inserting 10004 -> {}", 
				dao.insert(new Person(10005, "Tara2", "Berlin2", new Date())));
		
		logger.info("Update 10003 -> {}", 
				dao.update(new Person(10006, "Pieter2", "Utrecht2", new Date())));
		
	}
}
