package com.edubio77.authentication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @Transient
    private String passwordConfirmation;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    public User() {
    }
    
  //Getters
  	public Long getId() {
  		return id;
  	}
  	public String getEmail() {
  		return email;
  	}
  	public String getPassword() {
  		return password;
  	}
  	public String getPasswordConfirmation() {
  		return passwordConfirmation;
  	}
  	public Date getCreatedAt() {
  		return createdAt;
  	}
  	public Date getUpdatedAt() {
  		return updatedAt;
  	}
  	
  	//Setters
  	public void setId(Long id) {
  		this.id = id;
  	}
  	public void setEmail(String email) {
  		this.email = email;
  	}
  	public void setPassword(String password) {
  		this.password = password;
  	}
  	public void setPasswordConfirmation(String passwordConfirmation) {
  		this.passwordConfirmation = passwordConfirmation;
  	}
  	public void setCreatedAt(Date createdAt) {
  		this.createdAt = createdAt;
  	}
  	public void setUpdatedAt(Date updatedAt) {
  		this.updatedAt = updatedAt;
  	}   
    
    
    // otros getters y setters removidos para resumir.
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
