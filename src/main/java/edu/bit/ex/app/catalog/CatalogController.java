package edu.bit.ex.app.catalog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.domain.model.Category;
import edu.bit.ex.domain.model.Item;
import edu.bit.ex.domain.service.catalog.CatalogService;

@Controller
@RequestMapping("catalog")
public class CatalogController {
	
    @Inject
    protected CatalogService catalogService;
    
    @RequestMapping("/product-details/{itemId}")
    public String productDatails(@PathVariable("itemId") String itemId ) {
    	
    	System.out.println(itemId);
    	return "catalog/product-details";
    }

    @RequestMapping  
    public String main(Model model) {
        
    	Map<String,List<String>> categoryMap = new HashMap<String,List<String>>(); 
    	
    	List<Category> category = catalogService.getCategoryList();
    	System.out.println(category);
    	 
    	for (Category mCategory : category) {
    		
    		List<String> supplyList  = catalogService.getSupplierListByCategory(mCategory.getCategoryId());
    		categoryMap.put(mCategory.getCategoryId(), supplyList);
    	}
    	
    	System.out.println(categoryMap);    	
    	model.addAttribute("categoryMap", categoryMap);
    	
    	List<Item> items =  catalogService.getMainItems();
    	
    	for(Item item : items) {    	
    		System.out.println(item);	    	
    	}
    	
    	model.addAttribute("items", items);
    	
    	return "catalog/Main";
    }
    
    
}
