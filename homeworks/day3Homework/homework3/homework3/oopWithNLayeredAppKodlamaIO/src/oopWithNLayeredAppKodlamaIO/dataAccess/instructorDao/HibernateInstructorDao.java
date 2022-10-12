package oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao;

import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi : " + instructor.getId());
	}

}
