package com.example.category.Service;

import com.example.category.model.Product;
import com.example.category.repository.IProductRepository;
//import com.example.testapirestful.model.Computer;
//import com.example.testapirestful.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


import java.awt.print.Pageable;
import java.util.Optional;


@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository repository;


    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }


//    @Override
//    public Page<Product> findAll(Pageable pageable) {
//        return repository.findAll(pageable);
//    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}