package kevin.tan.spring.di.annotation.mvc;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService {
	
	@Resource(name="personDaoImpl")
	private PersonDao personDao;

	@Override
	public void savePerson() {
		this.personDao.savePerson();
	}

}
