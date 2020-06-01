package org.sid;


import org.sid.dao.VoyageurRepository;
import org.sid.entities.AppRole;

import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.sid.web.Voyageur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@SpringBootApplication
public class AuthentitationApplication implements CommandLineRunner {

	@Autowired
	private VoyageurRepository voyageurrepository;
	@Autowired 
	private AccountService  accountService;
	
 	public static void main(String[] args) {
		SpringApplication.run(AuthentitationApplication.class, args);
	}
 
	@Bean
	public BCryptPasswordEncoder getBCPE() { return new BCryptPasswordEncoder();}
	
	@Override
	public void run(String... arg0) throws Exception {/*
	voyageurrepository.save(new Voyageur("nizar","mehdi",1999,"Rabat","user@mail.com","062671990","1234"));
		 
	accountService.saveUser(new AppUser(null,"rim.ben@gmail.com","rim","benboukhourse",1999,"Rabat","+212671990829","abcd123",null));

		accountService.saveUser(new AppUser(null,"user@mail.com","nizar","mehdi",1999,"Rabat","+212671990829","1234",null));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"USER"));
		accountService.addRoleToUse("user@mail.com","USER");
		
		accountService.addRoleToUse("rim.ben@gmail.com","ADMIN");
		
/*
 * 
 * 
 * 
 * 

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
server.port=8080
spring.datasource.url = jdbc:mysql://localhost:3306/participationschema ?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password =
spring.devtools.livereload.enabled=false
spring.jpa.open-in-view=true
# Specify the DBMS
spring.jpa.database = MYSQL
# Show or not log for each sql query
spring.jpa.show-sql = true
# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto = update
# Naming strategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
#spring.thymeleaf.cache=false
#security.basic.enabled=false


*/





	}

}
