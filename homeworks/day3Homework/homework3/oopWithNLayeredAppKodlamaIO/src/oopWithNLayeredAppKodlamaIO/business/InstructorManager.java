package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.instructorDao.InstructorDao;
import oopWithNLayeredAppKodlamaIO.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	Instructor[] instructors = new Instructor[]{new Instructor("instructor0", "Engin", "Demirog", "demirogengin.png")};
	//I assumed that comes data from database
	public void add(Instructor instructor) throws Exception{
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getId());
		}
	}
}
