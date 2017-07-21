package spring.kevin.tan.createobject.when;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class WhenTest extends SpringHelper{
	
	static {
		path = "spring/kevin/tan/createobject/when/applicationContext.xml";
	}
	
	@Test
	public void test() {
//		HelloWorld bean = (HelloWorld)context.getBean("helloWorld");
//		bean.hello();
		
		/*
		 * 静态工厂模式创建实例
		 * 1.在spring容器启动的时候，开始创建HelloWorld对象
		 * 2.在context.getBean()又再次创建HelloWorld对象
		 */
		HelloWorld bean = (HelloWorld)context.getBean("helloWorld2");
		bean.hello();
	}
}
