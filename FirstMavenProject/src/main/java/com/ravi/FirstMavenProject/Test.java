package com.ravi.FirstMavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.asm.SpringAsmInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Appconfig.xml");
		
		Mobile m=(Mobile)context.getBean("mobile");
		m.config();
	
		
		
	}

}
