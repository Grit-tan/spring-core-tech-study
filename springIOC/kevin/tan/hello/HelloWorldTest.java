package kevin.tan.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	
	@Test
	public void Test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("kevin/tan/hello/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}
}
