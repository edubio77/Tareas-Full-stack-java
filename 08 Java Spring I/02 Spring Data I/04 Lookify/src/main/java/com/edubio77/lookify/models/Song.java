package com.edubio77.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Song {
		@Id
		@GeneratedValue
		private Long id;
		@Column
		@Size(min=1, max=100)
		private String titulo;
		@Column
		@Size(min=1, max=100)
		private String artista;
		@Column
		@Max(10)
		@Min(1)
		private int clasificacion;
		@Column
	    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	    private Date createdAt;
		@Column
		@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
		private Date updatedAt;
		public Song() {
		}
		public Song(String titulo, String artista, int clasificacion, Date createdAt, Date updatedAt) {
			this.titulo = titulo;
			this.artista = artista;
			this.clasificacion = clasificacion;
			this.createdAt = new Date();
			this.updatedAt = new Date();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getArtista() {
			return artista;
		}
		public void setArtista(String artista) {
			this.artista = artista;
		}
		public int getClasificacion() {
			return clasificacion;
		}
		public void setClasificacion(int clasificacion) {
			this.clasificacion = clasificacion;
		}
		public Date getCreatedAt() {
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
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
