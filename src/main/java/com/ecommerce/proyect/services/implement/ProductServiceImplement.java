package com.ecommerce.proyect.services.implement;

import com.ecommerce.proyect.models.Product;
import com.ecommerce.proyect.services.ProductService;
import com.ecommerce.proyect.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImplement implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
