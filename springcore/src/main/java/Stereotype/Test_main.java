package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype/stereoconfig.xml");
		Student s1 = (Student)context.getBean("ob", Student.class);
		
		
		System.out.println(s1);
		System.out.println(s1.getSubject());
		
	}

}
