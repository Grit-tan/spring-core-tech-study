package spring.kevin.tan.initdestroy;

/**
 * 
 * @author TANJM3
 * spring容器中对象的生命周期
 * 创建--构造函数
 * 初始化
 * 销毁
 *
 */

public class HelloWorld {
	
	public HelloWorld(){
		System.out.println("构造函数---aaaa");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void hello(){
		System.out.println("hello world");
	}
	
}
