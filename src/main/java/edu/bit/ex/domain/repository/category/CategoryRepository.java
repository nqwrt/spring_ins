package edu.bit.ex.domain.repository.category;

import java.util.List;

import edu.bit.ex.domain.model.Category;
import edu.bit.ex.domain.model.Image;
import edu.bit.ex.domain.model.Item;
import edu.bit.ex.domain.model.Product;

public interface CategoryRepository {

    List<Category> getCategoryList();

    Category getCategory(String categoryId);

    List<String> getSupplierListByCategory(String categoryId);
    
    List<Product> getMainProduct();
    
    List<Item> getMainItems();

}
