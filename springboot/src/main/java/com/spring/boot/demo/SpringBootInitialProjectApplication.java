package com.spring.boot.demo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "CRUD Operations", description = "Basic get,put,post,delete apis", version = "1.0" ,
				contact  = @Contact(
						name = "John Doe",
						email = "johndoe@gmail.com",
						url = "https://www.google.com"
		), license = @License(name = "Swagger 3.0 ltd")
		), externalDocs = @ExternalDocumentation(description = "This will guide you with Swagger : swagger.io")
)
public class SpringBootInitialProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootInitialProjectApplication.class, args);
//		String[] beans = context.getBeanDefinitionNames();
//		for(String bean : beans){
//			System.out.println(bean);
//		}
	}

}
