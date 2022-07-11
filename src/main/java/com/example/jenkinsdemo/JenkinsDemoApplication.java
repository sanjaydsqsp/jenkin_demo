package com.example.jenkinsdemo;


import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsDemoApplication {
 public static org.slf4j.Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);
   @PostConstruct
   public void init(){
	   logger.info("application running..");
   }
	public static void main(String[] args) {
		logger.info("application started");
	   SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
