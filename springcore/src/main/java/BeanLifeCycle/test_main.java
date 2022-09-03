package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle/config.xml");
        Samosa SS = (Samosa)context.getBean("S1");
        
        System.out.println(SS);
        // used to invoke destroy hook of the bean
        context.registerShutdownHook();
        
        Pepsi PP = (Pepsi)context.getBean("P1");
        System.out.println(PP);
		
        
	}

}
