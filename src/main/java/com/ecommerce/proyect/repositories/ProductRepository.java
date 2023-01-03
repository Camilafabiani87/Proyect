package com.ecommerce.proyect.repositories;

import com.ecommerce.proyect.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
