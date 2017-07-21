package spring.kevin.tan.initdestroy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kevin.tan.spring.util.SpringHelper;

public class InitDestroyTest extends SpringHelper{
	static{
		path = "spring/kevin/tan/initdestroy/applicationContext.xml";
	}
	@Test
	public void test(){
		ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext)context;
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.hello();
		applicationContext.close();
		
		
	}
}
