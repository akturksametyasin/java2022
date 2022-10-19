package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao.CategoryDao;
import oopWithNLayeredAppKodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	Category[] categories = new Category[]{new Category("category0","Programlama")};		//I assumed that comes data from database
		
	public void add(Category category) throws Exception {
		for (Category ctgry : categories) {
			if(ctgry.getName() == category.getName()) {
				throw new Exception("Kategori isimleri aynı olamaz!");
			}
		}
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getId());
		}
	}
	
}
