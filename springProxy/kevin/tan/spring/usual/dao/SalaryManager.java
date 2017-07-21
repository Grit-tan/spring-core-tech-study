package kevin.tan.spring.usual.dao;
/**
 * 需求：开始安全性检查   , 开启日志检查 ，权限判断后，查看工资的情况
 * @author TANJM3
 *
 */
public class SalaryManager {
	private Logger logger;
	private Privilege privilege;
	private Security security;
	
	public SalaryManager(Security security, Logger log, Privilege privilege) {
		super();
		this.security = security;
		this.logger = log;
		this.privilege = privilege;
	}
	
	public void showSalary() {
		this.security.security();
		this.logger.log();
		if ("admin".equals(privilege.getAccess())) {
			System.out.println("这个月工资涨了10%...");
		} else {
			System.out.println("对不起，你无权限查看工资！");
		}
	}
}
