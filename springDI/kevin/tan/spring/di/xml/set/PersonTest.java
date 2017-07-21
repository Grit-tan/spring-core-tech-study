package kevin.tan.spring.di.xml.set;

import java.util.List;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path="kevin/tan/spring/di/xml/set/applicationContext.xml";
	}
	@Test
	public void test(){
		Person person = (Person) context.getBean("person");
		System.out.println(person.getPname());
		List list =  person.getLists();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
