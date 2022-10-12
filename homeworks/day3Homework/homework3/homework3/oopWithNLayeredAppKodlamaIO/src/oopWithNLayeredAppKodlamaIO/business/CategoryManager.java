package oopWithNLayeredAppKodlamaIO.business;

import oopWithNLayeredAppKodlamaIO.core.logging.Logger;
import oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao.CategoryDao;
import oopWithNLayeredAppKodlamaIO.entities.Category;

public class CategoryManager {
	private Category[] categories;
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(Category[] categories, CategoryDao categoryDao, Logger[] loggers) {
		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category ctgry : categories) {
			if(ctgry.getName() == category.getName() && ctgry != category) {
				throw new Exception("Kategori isimleri aynı olamaz!");
			}
		}
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getId());
		}
	}
	
}
