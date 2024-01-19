package io.creh.productsservice.service;

import io.creh.productsserive.model.Brand;
import io.creh.productsservice.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    BrandRepository brandRepository;

    public ArrayList<Brand> listBrand() {
        return (ArrayList<Brand>) brandRepository.findAll();
    }

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    public Optional<Brand> searchBrandById(Integer id) {
        return brandRepository.findById(id);
    }

}
