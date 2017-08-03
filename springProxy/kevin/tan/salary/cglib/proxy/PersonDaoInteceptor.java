package kevin.tan.salary.cglib.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class PersonDaoInteceptor implements MethodInterceptor {
	
	private Transaction transaction;
	private Object target;
	
	
	public PersonDaoInteceptor() {
		super();
	}
	
	public PersonDaoInteceptor(Transaction transaction, Object target) {
		super();
		this.transaction = transaction;
		this.target = target;
	}
	
	/**
	 * 产生代理对象
	 * @return
	 */
	public Object createProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());//设置目标类为代理类的父类
		enhancer.setCallback(this);//设置拦截器为回调函数
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		Object obj;
		String methodName = method.getName();
		if ("updatePerson".equals(methodName) || "addPerson".equals(methodName) || "deletePerson".equals(methodName)) {
			//开启事务
			this.transaction.beginTransaction();
			//调用目标类的目标方法
			obj = method.invoke(this.target, args);
			//做是否提交事务
			this.transaction.commit();
		} else {
			//调用目标类的目标方法
			obj = method.invoke(this.target, args);
		}
		return obj;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	

}
