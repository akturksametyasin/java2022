package oopWithNLayeredAppKodlamaIO;

import oopWithNLayeredAppKodlamaIO.business.CategoryManager;
import oopWithNLayeredAppKodlamaIO.business.CourseManager;
import oopWithNLayeredAppKodlamaIO.business.InstructorManager;
import oopWithNLayeredAppKodlamaIO.core.logging.DatabaseLogger;
import oopWithNLayeredAppKodlamaIO.core.logging.FileLogger;
import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.core.logging.MailLogger;
import oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao.JdbcCategoryDao;
import oopWithNLayeredAppKodlamaIO.dataAccess.courseDao.JdbcCourseDao;
import oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao.HibernateInstructorDao;
import oopWithNLayeredAppKodlamaIO.entities.Category;
import oopWithNLayeredAppKodlamaIO.entities.Course;
import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = new Logger[]{new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Category[] categories = new Category[]{new Category("category0","Programlama"),
											   new Category("category1","Frontend"),
											   new Category("category2","Backend")
											   };
		CategoryManager categoryManager = new CategoryManager(categories, new JdbcCategoryDao(), loggers);
		for(Category category : categories) {
			categoryManager.add(category);
			System.out.println("-----------------------------------------------");
		}
		
		
		System.out.println("*******************************************************************");
		
		
		Instructor[] instructors = new Instructor[]{new Instructor("instructor0", "Engin", "Demirog", "demirogengin.png"),
													new Instructor("instructor1", "Halit", "Kalayci", "kalaycihalit.png")
													};
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		for(Instructor instructor : instructors) {
			instructorManager.add(instructor);
			System.out.println("-----------------------------------------------");
		}
		
		
		System.out.println("*******************************************************************");
		
		
		Course[] courses = new Course[] {new Course("course0", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", "java.png", "Java Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
										 new Course("course1", "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "net.png", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
										 new Course("course2", "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "javaScript.png", "1.5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
										 new Course("course3", "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "javaAndReact.png", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0), 
										 new Course("course4", "Programlamaya Giriş İçin Temel Kurs", "programlamaGiris.png", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.", 0), 
										 new Course("course5", "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", "cAndAngular.png", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0)
										 };
		CourseManager courseManager = new CourseManager(courses, new JdbcCourseDao(), loggers);
		for(Course course : courses) {
			courseManager.add(course);
			System.out.println("-----------------------------------------------");
		}
		
	}

}.
