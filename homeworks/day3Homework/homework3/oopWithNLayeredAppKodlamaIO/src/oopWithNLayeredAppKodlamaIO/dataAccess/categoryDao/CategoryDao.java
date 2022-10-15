package oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao;

import oopWithNLayeredAppKodlamaIO.entities.Category;

public interface CategoryDao {
	
	public Category[] getAllCategories();
	public void add(Category category);
	
}
