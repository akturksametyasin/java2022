package oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao;

import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public interface InstructorDao {
	public Instructor[] getAllInstructors();
	void add(Instructor instructor);
}
