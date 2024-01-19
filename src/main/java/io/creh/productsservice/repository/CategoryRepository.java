package io.creh.productsservice.repository;

import io.creh.productsserive.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
