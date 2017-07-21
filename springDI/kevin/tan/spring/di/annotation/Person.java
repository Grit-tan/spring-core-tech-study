package kevin.tan.spring.di.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Person {
	
	//@Resource(name="student"),@Resource(name="studen"),@Resource(name="aaa")
	//@Autowired//按照类型进行匹配
	//@Qualifier("student")//按照id进行匹配
	@Resource
	private Student student;// 引用类型
	//注解只能用于引用类型  
	private Long pid;
	
	public void show() {
		this.student.say();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
	
	
}
