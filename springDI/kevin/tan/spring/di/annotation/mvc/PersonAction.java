package kevin.tan.spring.di.annotation.mvc;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("personAction")
public class PersonAction {
	
	@Resource(name="personServiceImpl")
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
}
