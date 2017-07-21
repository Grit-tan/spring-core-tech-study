package kevin.tan.spring.di.annotation.mvc;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class PersonTest extends SpringHelper{
	static {
		path = "kevin/tan/spring/di/annotation/mvc/applicationContext.xml";
	}
	
	@Test
	public void test() {
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.getPersonService().savePerson();
		
		
	}

}
