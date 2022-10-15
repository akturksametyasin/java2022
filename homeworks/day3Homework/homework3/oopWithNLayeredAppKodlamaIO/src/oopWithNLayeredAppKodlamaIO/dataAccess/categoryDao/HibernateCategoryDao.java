package oopWithNLayeredAppKodlamaIO.dataAccess.categoryDao;

import oopWithNLayeredAppKodlamaIO.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	@Override
	public Category[] getAllCategories() {
		Category[] categories = new Category[]{new Category("category0","Programlama")};
		return categories;
	}
	
	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi : " + category.getId());
	}

}
