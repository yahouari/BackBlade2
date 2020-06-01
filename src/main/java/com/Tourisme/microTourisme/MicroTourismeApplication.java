package com.Tourisme.microTourisme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.Tourisme.microTourisme.Model.Services.Voyage;
import com.Tourisme.microTourisme.Model.Services.Repository.EvaluationRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageurRepository;


@SpringBootApplication
public class MicroTourismeApplication implements CommandLineRunner {
	
	
	@Autowired
	private EvaluationRepository evaluationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroTourismeApplication.class, args);
	}
	
	public void run (String... args) throws Exception{
		/*
		evaluationRepository.findAll().forEach(v->{
    System.out.println(v.toString());
});*/
		}
	
/*server.port=9090

spring.datasource.url=jdbc:mysql://localhost:3306/participationschema?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database=MYSQL
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect*/
}
