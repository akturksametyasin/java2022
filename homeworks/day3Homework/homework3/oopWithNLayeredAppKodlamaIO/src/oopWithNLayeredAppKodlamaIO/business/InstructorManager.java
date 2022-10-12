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
	
	public void add(Instructor instructor) throws Exception{
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getId());
		}
	}
}
