package kevin.tan.salary.cglib.proxy;

import org.junit.Test;

public class PersonDaoTest {
	
	@Test
	public void test() {
		Transaction transaction = new Transaction();
		PersonDao personDao = new PersonDao();
		PersonDaoInteceptor inteceptor = new PersonDaoInteceptor(transaction,personDao);
		//代理类是目标类的子类。
		PersonDao proxy = (PersonDao)inteceptor.createProxy();
		proxy.addPerson();
	}
	
	/**
	 * 概念：目标类，代理类，拦截器
	 * jdk:
	 * 目标类和代理类实现了共同的接口
	 * 拦截器必须实现jdk提供的InvocationHandler，而这个接口中的invoke方法体内容=代理对象方法体内容
	 * 当客户端用代理对象调用方法时，invoke方法执行
	 * cglib:
	 * 目标类是代理类的父类
	 * 拦截器实现了MethodInterceptor，而接口中的intercept方法=代理对象方法体
	 * 使用字节码增强机制创建代理对象
	 * 
	 */
	
}
