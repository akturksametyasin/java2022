package oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao;

import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi : " + instructor.getId());
	}

}
