package spring.kevin.tan.scope;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class HelloWorldTest extends SpringHelper {
	
	static {
		path = "spring/kevin/tan/scope/applicationContext.xml";
	}
	
	@Test
	public void test() {
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getList().add("aaaa");
		helloWorld.hello();
		System.out.println(helloWorld);
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		helloWorld2.getList().add("vvvv");
		helloWorld2.hello();
		System.out.println(helloWorld2);
		System.out.println(helloWorld.getList().size());
		System.out.println(helloWorld2.getList().size());
	}
}
