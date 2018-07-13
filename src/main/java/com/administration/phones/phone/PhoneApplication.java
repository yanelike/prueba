package com.administration.phones.phone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy; 

@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan({"com.administration.phones.*"}) 
@EntityScan("com.administration.phones.entity")
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		AopAutoConfiguration.class
} )
public class PhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneApplication.class, args);
	}
}
