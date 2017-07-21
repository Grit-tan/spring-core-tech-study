package kevin.tan.spring.di.annotation;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;

public class PersonTest extends SpringHelper{
	static {
		path = "kevin/tan/spring/di/annotation/applicationContext.xml";
	}
	
	@Test
	public void test() {
		Person p = (Person)context.getBean("person");
		p.show();
	}
	
	/*
	 * readme:
	 * 	@Resource ----一般定义在属性上，当然也可以定义在类，方法上
		@Autowired//按照类型进行匹配
		@Qualifier("student")//按照id进行匹配
		@PostConstruct
		@PreDestroy
	 */
}
