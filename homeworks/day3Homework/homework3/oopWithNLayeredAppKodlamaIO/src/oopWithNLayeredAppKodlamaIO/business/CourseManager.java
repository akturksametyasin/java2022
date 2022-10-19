package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.courseDao.CourseDao;
import oopWithNLayeredAppKodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	Course[] courses = new Course[] {new Course("course0", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "java.png", "Java Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
			 						 new Course("course1", "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "net.png", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
			 						 new Course("course2", "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "javaScript.png", "1.5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
			 						 new Course("course3", "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "javaAndReact.png", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
			 						 new Course("course4", "Programlamaya Giriş İçin Temel Kurs", "programlamaGiris.png", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.", 0)
			 						 };		//I assumed that comes data from database
	
	public void add(Course course) throws Exception {
		for (Course crs : courses) {
			if((crs.getName() == course.getName())) {
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
