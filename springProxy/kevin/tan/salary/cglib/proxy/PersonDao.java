package kevin.tan.salary.cglib.proxy;

public class PersonDao {
	
	
	public void updatePerson() {
		System.out.println("update person");
	}
	
	public void addPerson() {
		System.out.println("add person");
	}
	
	public void deletePerson() {
		System.out.println("delete person");
	}
	
	public void listPersons() {
		System.out.println("list person");
	}
}
