package com.Tourisme.microTourisme.Model.Services;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "voyage")

public class Voyage {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVoyage;
    private String categorie;
    private String destination;
    private int prix;
    private String Description;
	public Integer getIdVoyage() {
		return idVoyage;
	}
	public void setIdVoyage(Integer idVoyage) {
		this.idVoyage = idVoyage;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
   
}


