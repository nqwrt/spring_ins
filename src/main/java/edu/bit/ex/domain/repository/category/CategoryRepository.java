package edu.bit.ex.domain.repository.category;

import java.util.List;
import edu.bit.ex.domain.model.Category;

public interface CategoryRepository {

    List<Category> getCategoryList();

    Category getCategory(String categoryId);

}
