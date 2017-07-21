package kevin.tan.spring.annotation;

@Name("自定义注解")
public class School {
	
	@Description(value = "java开发")
	public void java() {
		System.out.println("java");
	}
	
	@Description(value = "linux学习")
	public void linux() {
		System.out.println("linux");
	}
}
