package oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao;

import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	@Override
	public Instructor[] getAllInstructors() {
		Instructor[] instructors = new Instructor[]{new Instructor("instructor0", "Engin", "Demirog", "demirogengin.png")};
		return instructors;
	}
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi : " + instructor.getId());
	}

}
