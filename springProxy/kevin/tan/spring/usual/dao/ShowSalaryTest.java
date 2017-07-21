package kevin.tan.spring.usual.dao;

import org.junit.Test;

public class ShowSalaryTest {
	
	@Test
	public void test() {
		Security security = new Security();
		Logger log = new Logger();
		Privilege privilege = new Privilege();
		privilege.setAccess("admin");
		SalaryManager sm = new SalaryManager(security,log,privilege);
		sm.showSalary();
	}
}
