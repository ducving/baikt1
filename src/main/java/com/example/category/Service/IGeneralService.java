package com.example.category.Service;

import com.example.category.model.Product;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public interface IGeneralService<E> {
    Iterable<E> findAll();


    Optional<E> findById(Long id);


    E save(E e);

    public Page<Product> findAll(Pageable pageable);


    void remove(Long id);
}