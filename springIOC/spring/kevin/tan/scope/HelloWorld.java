package spring.kevin.tan.scope;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	private List<String> list = new ArrayList<String>();
	
	HelloWorld() {
		System.out.println("构造函数--aaa");
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void hello(){
		System.out.println("Hello,World!");
	}
	
	
	
}
