package kevin.tan.spring.di.scanAndAnnotation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //如果想要person类变为多例模式，则要配置这个scope的值，默认scope为singleton为单例模式
public class Person {
	
	private List<String> list = null;
	
	@Resource
	private Student stu;
	
	public Person() {
		list = new ArrayList<String>();
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	
	
}
