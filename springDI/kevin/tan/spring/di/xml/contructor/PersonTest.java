package kevin.tan.spring.di.xml.contructor;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;


public class PersonTest extends SpringHelper{
	static{
		path = "kevin/tan/spring/di/xml/contructor/applicationContext.xml";
	}
	
	@Test
	public void test(){
		Person person = (Person)context.getBean("person");
		System.out.println(person.getPid());
		person.getStudent().say();
	}
}
