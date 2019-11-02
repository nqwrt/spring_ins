package edu.bit.ex.app.catalog;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.domain.service.catalog.CatalogService;

@Controller
@RequestMapping("catalog")
public class CatalogController {
	
    @Inject
    protected CatalogService catalogService;

    @RequestMapping
    public String main() {
        return "catalog/Main";
    }
}
