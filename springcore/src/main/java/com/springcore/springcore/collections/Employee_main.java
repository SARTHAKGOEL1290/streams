package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.Student;

public class Employee_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/collectionconfig.xml");
        		 
        Employee e2 = (Employee)context.getBean("Employee2");
   
      //  System.out.println(e1);
        
        System.out.println();
        
        System.out.println(e2);
    
	}

}
