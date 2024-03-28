package com.example.Spring.Data.Jpa.utils;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface Auditable {

    void setCreatedBy(String createdBy);
    void setCreatedAt(Date createdAt);
    void setLastModifiedBy(String lastModifiedBy);
    void setLastModifiedAt(Date lastModifiedAt);
}
