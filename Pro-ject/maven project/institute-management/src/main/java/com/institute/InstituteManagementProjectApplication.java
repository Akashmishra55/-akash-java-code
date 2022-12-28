package com.institute;
/*
@AuthorName = Akash Mishra
@ProjectName = Institute management System
@Date = 25-12-22
*/

//imporitng classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Main Application class
@SpringBootApplication
public class InstituteManagementProjectApplication {

	//main Method
	public static void main(String[] args) {
		SpringApplication.run(InstituteManagementSystemApplication.class, args);  //it will run our spring boot project
		System.out.println("--------Running------------");  //printing statement
	}

}
