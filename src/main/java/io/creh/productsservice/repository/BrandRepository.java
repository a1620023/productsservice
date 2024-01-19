package io.creh.productsservice.repository;

import io.creh.productsservice.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {
}
