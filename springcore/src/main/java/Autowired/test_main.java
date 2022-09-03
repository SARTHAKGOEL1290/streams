package Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext  context = new ClassPathXmlApplicationContext("Autowired/autowiredconfig.xml");
	     Employee e1 = context.getBean("Emp",Employee.class);
	    // Employee e2 = context.getBean("Emp",Employee.class);
	     
	     System.out.println(e1);
	    
	}

}
