package edu.bit.ex.domain.service.catalog;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import edu.bit.ex.domain.model.Category;
import edu.bit.ex.domain.repository.category.CategoryRepository;


@Service
public class CatalogServiceImpl implements CatalogService {

    @Inject
    private CategoryRepository categoryRepository;

/*    @Inject
    private ItemRepository itemRepository;

    @Inject
    private ProductRepository productRepository;*/

    /*
     * (non-Javadoc)
     * @see ik.am.jpetstore.domain.service.catalog.CategoryService#getCategoryList()
     */
    @Override
    public List<Category> getCategoryList() {
    	return categoryRepository.getCategoryList();
    }

    /*
     * (non-Javadoc)
     * @see ik.am.jpetstore.domain.service.catalog.CategoryService#getCategory(java.lang.String)
     */
    @Override
    public Category getCategory(String categoryId) {
    	return categoryRepository.getCategory(categoryId);
    }

	@Override
	public List<String> getSupplierListByCategory(String categoryId) {
		return categoryRepository.getSupplierListByCategory(categoryId);
	}
}
