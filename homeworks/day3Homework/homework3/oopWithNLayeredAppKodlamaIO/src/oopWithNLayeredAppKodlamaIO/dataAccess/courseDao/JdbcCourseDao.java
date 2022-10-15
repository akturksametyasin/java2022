package oopWithNLayeredAppKodlamaIO.dataAccess.courseDao;

import oopWithNLayeredAppKodlamaIO.entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	@Override
	public Course[] getAllCourses() {
		Course[] courses = new Course[] {new Course("course0", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "java.png", "Java Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
				 						 new Course("course1", "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "net.png", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
				 						 new Course("course2", "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "javaScript.png", "1.5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
				 						 new Course("course3", "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "javaAndReact.png", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0)
										};
		return courses;
	}
	
	@Override
	public void add(Course course) {
			System.out.println("JDBC ile veritabanına eklendi : " + course.getId());
	}

}
