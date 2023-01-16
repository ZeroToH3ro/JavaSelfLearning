package com.springmvc.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.demo.models.Category;

public interface CategoryRepository extends CrudRepository<Category, String>{
    
}
