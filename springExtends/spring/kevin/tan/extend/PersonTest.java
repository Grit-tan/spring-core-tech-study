package spring.kevin.tan.extend;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class PersonTest extends SpringHelper{
	
	static {
		path = "spring/kevin/tan/extend/applicationContext.xml";
	}
	
	@Test
	public void test() {
		Student stu = (Student)context.getBean("student");
		stu.say();
	}
}
