package kevin.tan.salary.cglib.proxy;
/*
 * hibernate编程
 * 开启事务
 * 进行增删改查(目标类的目标方法)
 * 结束事务
 */
public class Transaction {
	
	
	public void beginTransaction() {
		System.out.println("begin transaction");
	}
	
	public void commit() {
		System.out.println("commit");
	}
}
