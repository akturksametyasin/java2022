package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.courseDao.CourseDao;
import oopWithNLayeredAppKodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;
	
	public CourseManager(Course[] courses, CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		for (Course crs : courses) {
			if((crs.getName() == course.getName() && crs != course)) {
				throw new Exception("Kurs isimleri aynı olamaz!");
			}
			if(crs.getPrice()<0) {
				throw new Exception("Kurs ücreti sıfırdan küçük olamaz!");
			}
		}
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getId());
		}
	}
	
}
