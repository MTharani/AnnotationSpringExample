package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.edu")
public class AppConfig 
{
 @Bean
 public Oppo getPhone()
 {
	 return new Oppo();
 }
 @Bean
 public Mobileprocessor getProcessor()
 {
	 return new SnapDragon();
 }
 
 
}
