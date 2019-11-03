package edu.bit.ex.domain.service.catalog;

import java.util.List;

import edu.bit.ex.domain.model.Category;

public interface CatalogService {
    
	List<Category> getCategoryList();

    Category getCategory(String categoryId);
    
    List<String> getSupplierListByCategory(String categoryId);
}
