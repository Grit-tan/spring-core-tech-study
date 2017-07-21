package kevin.tan.salary.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import kevin.tan.salary.proxy.Logger;
import kevin.tan.salary.proxy.Privilege;
import kevin.tan.salary.proxy.Security;

/**
 * 代理类，基于实现jdk InvocationHandler 的代理类 
 *
 */

public class SalaryManageJDKProxy implements InvocationHandler{
	
	private Logger log;
	private Privilege privilege;
	private Security security;
	private Object target;
	
	public SalaryManageJDKProxy() {
		super();
	}

	public SalaryManageJDKProxy(Logger log, Privilege privilege, Security security) {
		super();
		this.log = log;
		this.privilege = privilege;
		this.security = security;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.security.security();
		this.log.log();
		if ("admin".equals(this.privilege.getAccess())) {
			method.invoke(this.target, args);
		} else {
			System.out.println("对不起，你没有权限访问！");
		}
		return null;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
}
