package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class Oppo 
{
@Autowired
Mobileprocessor cpu;

public Mobileprocessor getCpu() {
	return cpu;
}

public void setCpu(Mobileprocessor cpu) {
	this.cpu = cpu;
}
public void mobileconf()
{
	System.out.println("4GB-Ram,dudal Camer");
	cpu.processor();
}
}
