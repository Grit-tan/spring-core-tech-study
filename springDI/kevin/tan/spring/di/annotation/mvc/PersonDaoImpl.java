package kevin.tan.spring.di.annotation.mvc;

import org.springframework.stereotype.Repository;

@Repository("personDaoImpl")
public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("save person ...");
	}

}
