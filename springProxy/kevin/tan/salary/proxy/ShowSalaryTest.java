package kevin.tan.salary.proxy;

import org.junit.Test;

public class ShowSalaryTest {
	
	/**
	 * 通过引入代理类，将目标类和公共事务分离
	 */
	@Test
	public void test() {
		Security security = new Security();
		Logger log = new Logger();
		Privilege privilege = new Privilege();
		privilege.setAccess("admin");
		SalaryManage sm = new SalaryManageImpl();
		/**
		 * 代理类调用代理方法，执行目标类目标方法。达到了预期效果
		 */
		new SalaryManageProxy(log, privilege, security, sm).showSalary();;
	}
}
