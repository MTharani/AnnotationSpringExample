package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Oppo o1=ctx.getBean(Oppo.class);
		o1.mobileconf();

	}

}
