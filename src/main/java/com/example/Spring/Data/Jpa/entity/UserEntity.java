package com.example.Spring.Data.Jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
@Entity
public class UserEntity {

    @Id
    private Integer userID;

    @Column
    private String username;

    @Column
    private Integer age;

    @Column
    private Date dob;

    @Column
    private String email;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }

    public UserEntity(Integer userID, String username, Integer age, Date dob, String email) {
        this.userID = userID;
        this.username = username;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public UserEntity() {
    }
}
