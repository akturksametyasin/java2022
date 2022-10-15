package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.courseDao.CourseDao;
import oopWithNLayeredAppKodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courseDao.getAllCourses();
	}
	
	public void add(Course course) throws Exception {
		for (Course crs : courses) {
			if((crs.getName() == course.getName() && crs != course)) {
				throw new Exception("Kurs isimleri aynı olamaz!");
			}
			if(course.getPrice()<0) {
				throw new Exception("Kurs ücreti sıfırdan küçük olamaz!");
			}
		}
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getId());
		}
	}
	
}
