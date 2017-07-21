package kevin.tan.spring.di.xml.contructor;


public class Person {
	private Long pid;
	private String pname;
	private Student student;
	
	public Long getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public Student getStudent() {
		return student;
	}
	public Person(Long pid,String pname){
		this.pid = pid;
		this.pname = pname;
	}
	
	public Person(String pname,Student student){
		this.pname = pname;
		this.student = student;
	}
}
