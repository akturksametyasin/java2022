package oopWithNLayeredAppKodlamaIO.dataAccess.courseDao;

import oopWithNLayeredAppKodlamaIO.entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	@Override
	public void add(Course course) {
			System.out.println("JDBC ile veritabanına eklendi : " + course.getId());
	}
	
}
