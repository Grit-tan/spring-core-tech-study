package kevin.tan.salary.proxy;
/**
 * 目标类的代理类
 *
 */
public class SalaryManageProxy {
	private Logger log;
	private Privilege privilege;
	private Security security;
	private SalaryManage salaryManager;
	
	public SalaryManageProxy() {
		super();
	}

	public SalaryManageProxy(Logger log, Privilege privilege, Security security, SalaryManage salaryManager) {
		super();
		this.log = log;
		this.privilege = privilege;
		this.security = security;
		this.salaryManager = salaryManager;
	}
	/**
	 * 优点：添加了代理类，将目标类和公共事务分离
	 * 缺点：代理类的代理方法中目标类和目标方法被固定死了，无法动态变化，不可重用。
	 */
	//代理方法
	public void showSalary() {
		this.log.log();
		this.security.security();
		if ("admin".equals(privilege.getAccess())) {
			salaryManager.showSalary();// 目标类的目标方法
		} else {
			System.out.println("对不起，你没有权限访问！");
		}
	}
	
	
}
