package oopWithNLayeredAppKodlamaIO;

import oopWithNLayeredAppKodlamaIO.business.CategoryManager;
import oopWithNLayeredAppKodlamaIO.business.CourseManager;
import oopWithNLayeredAppKodlamaIO.business.InstructorManager;
import oopWithNLayeredAppKodlamaIO.core.logging.DatabaseLogger;
import oopWithNLayeredAppKodlamaIO.core.logging.FileLogger;
import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.core.logging.MailLogger;
import oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao.JdbcCategoryDao;
import oopWithNLayeredAppKodlamaIO.dataAccess.courseDao.HibernateCourseDao;
import oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao.JdbcInstructorDao;
import oopWithNLayeredAppKodlamaIO.entities.Category;
import oopWithNLayeredAppKodlamaIO.entities.Course;
import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = new Logger[]{new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		
		Category category1 = new Category("category1", "Front-end");
		categoryManager.add(category1);
		
		System.out.println("-----------------------------------------------");
		
		Category category2 = new Category("category2", "Back-end");
		categoryManager.add(category2);
		
		
		System.out.println("*******************************************************************");
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		
		Course course1 = new Course("course4", "Programlamaya Giriş İçin Temel Kurs", "programlamaGiris.png", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.", 0); 
		courseManager.add(course1);
		
		System.out.println("-----------------------------------------------");
		
		Course course2 = new Course("course5", "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", "cAndAngular.png", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, doküman ve duyurularını buradan yapacağız.", 0);		
		courseManager.add(course2);
		
		
		System.out.println("*******************************************************************");
		
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		
		Instructor instructor1 = new Instructor("instructor1", "Halit", "Kalayci", "kalaycihalit.png");
		instructorManager.add(instructor1);
		
	}

}
