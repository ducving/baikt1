package com.example.category.repository;

import com.example.category.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface IProductRepository extends JpaRepository<Product,Long> {

}
