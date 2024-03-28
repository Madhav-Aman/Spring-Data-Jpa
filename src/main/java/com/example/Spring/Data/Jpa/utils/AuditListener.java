package com.example.Spring.Data.Jpa.utils;

import com.example.Spring.Data.Jpa.entity.Product;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;


public class AuditListener {


    @PrePersist
    public void setCreatedFieldsAt(Object target){
        if(target instanceof Product){
            Product product = (Product) target;
            product.setCreatedAt(new Date());
            product.setCreatedBy("Madhav Aman Srivastava");
        }
    }


    @PreUpdate
    public void setLastModifiedFieldsAt(Object target){
        if(target instanceof Product){
            Product product = (Product) target;
            product.setLastModifiedAt(new Date());
            product.setLastModifiedBy("Madhav Aman Srivastava");
        }
    }
}
