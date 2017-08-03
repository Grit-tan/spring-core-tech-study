package kevin.tan.salary.jdk.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

import kevin.tan.salary.proxy.Logger;
import kevin.tan.salary.proxy.Privilege;
import kevin.tan.salary.proxy.SalaryManage;
import kevin.tan.salary.proxy.SalaryManageImpl;
import kevin.tan.salary.proxy.Security;

public class JDKProxySalaryTest {
	
	@Test
	public void test() {
		Security security = new Security();
		Logger log = new Logger();
		Privilege privilege = new Privilege();
		privilege.setAccess("admin");
		SalaryManage sm = new SalaryManageImpl();
		//拦截器
		SalaryManageJDKProxy salaryManageJDKProxy = new SalaryManageJDKProxy(log, privilege, security);
		salaryManageJDKProxy.setTarget(sm);
		/**
		 * 生成代理对象
		 * ClassLoader loader, 目标类的类加载器
         * Class<?>[] interfaces,目标类的接口数组
         *  InvocationHandler h,代理类实例
		 */
		SalaryManage newProxyInstance = (SalaryManage) Proxy.newProxyInstance(SalaryManage.class.getClassLoader(),
				new Class[] { SalaryManage.class }, salaryManageJDKProxy);//代理对象,被创建的代理对象实现过了目标类的接口
		newProxyInstance.showSalary();
	}
}
