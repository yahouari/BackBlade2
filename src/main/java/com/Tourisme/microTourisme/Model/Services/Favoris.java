package com.Tourisme.microTourisme.Model.Services;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "favoris")

public class Favoris {
	
	@Id
	@Column(name="id_favoris")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id_favoris;
	 private int id_destination;
     private int idVoyageur; 
	 private String nom_favoris;
	 private int prix;
	 private String Description;
	 private String mail;
	
	 public Integer getId_favoris() {
		return id_favoris;
	}

	public void setId_favoris(Integer id_favoris) {
		this.id_favoris = id_favoris;
	}

	public int getId_destination() {
		return id_destination;
	}

	public void setId_destination(int id_destination) {
		this.id_destination = id_destination;
	}

	public int getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(int idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNom_favoris() {
		return nom_favoris;
	}

	public void setNom_favoris(String nom_favoris) {
		this.nom_favoris = nom_favoris;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Favoris(int id_destination, int idVoyageur, String nom_favoris, String description, int prix, String mail) {
			super();
			this.id_destination = id_destination;
			this.idVoyageur = idVoyageur;
			this.nom_favoris = nom_favoris;
			this.prix = prix;
			this.Description = description;
			this.mail=mail;
		}
}