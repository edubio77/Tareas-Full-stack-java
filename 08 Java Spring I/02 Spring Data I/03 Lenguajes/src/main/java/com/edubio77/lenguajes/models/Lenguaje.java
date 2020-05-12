package com.edubio77.lenguajes.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="lenguajes")
public class Lenguaje {
		
		//Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		//COLUMNAS
		@Column
		@Size(min=2, max=20)
		private String name;
		
		@Column
		@Size(min=2, max=20)
		private String creator;
		
		@Column
		@Size(min=1)
		private String version;
		
		@Column(updatable=false)
		private Date createdAt;
		private Date updatedAt;
	
	//Ejecuta el método justo antes que el objeto sea creado.
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }

	//Ejecuta el método cuando el objeto es modificado.
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		
		
	 //CONTRUCTORES
		public Lenguaje() {
		}
		
		public Lenguaje(String name, String creator, String version, Date createdAt, Date updatedAt) {
			this.name = name;
			this.creator = creator;
			this.version = version;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}

		
	//GETTERS Y SETTERS
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Date getCreated_at() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		
	
	}

