package com.jiecaipeng.ecommerce.dao;

import com.jiecaipeng.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
