package com.springmvc.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.demo.models.Category;
import com.springmvc.demo.repositories.CategoryRepository;

@Controller
@RequestMapping(path = "categories")
public class CategoryController {
    // https:localhost:8080/categories
    // return name of .jsp file
    @Autowired // inject "category repository" = dependency injection
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap) {
        // data send to jsp => ModelMap
        // modelMap.addAttribute("name", "Minh");
        // modelMap.addAttribute("age", 20);
        // System.out.println("debug");

        Iterable<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories", categories);
        
        return "category";
    }
}
