package com.example.Spring.Data.Jpa.service;

import com.example.Spring.Data.Jpa.entity.Product;
import com.example.Spring.Data.Jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public void Create(){
        Product product = new Product();
        product.setName("Madhav");

        productRepository.save(product);
    }

    public void update(Integer id){
        Product p = productRepository.findById(id).get();
        p.setName("AMAN SRIVASTAVA ASAP");
        productRepository.save(p);
    }
}
