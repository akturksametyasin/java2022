package oopWithNLayeredAppKodlamaIO.dataAccess.courseDao;

import oopWithNLayeredAppKodlamaIO.entities.Course;

public interface CourseDao {
	public Course[] getAllCourses();
	void add(Course course);
}
