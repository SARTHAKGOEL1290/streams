package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        		 
        Student stud = (Student) context.getBean("Student1");
        Student stud2 = (Student) context.getBean("Student2");
        System.out.println(stud);
        
        System.out.println();
        
        System.out.println(stud2.getStudentId());
        
    }
}
