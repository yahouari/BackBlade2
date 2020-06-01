package com.Tourisme.microTourisme.Model.Services;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "voyageur")

public class Voyageur {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVoyageur;
    private String nom;
    private String prenom;
    private int AnneeDeNaissance;
    private String LieuDeNaissance;
    private String mail;
    private int tel;
	private String motDePasse;
	public Integer getIdVoyageur() {
		return idVoyageur;
	}
	public void setIdVoyageur(Integer idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAnneeDeNaissance() {
		return AnneeDeNaissance;
	}
	public void setAnneeDeNaissance(int anneeDeNaissance) {
		AnneeDeNaissance = anneeDeNaissance;
	}
	public String getLieuDeNaissance() {
		return LieuDeNaissance;
	}
	public void setLieuDeNaissance(String lieuDeNaissance) {
		LieuDeNaissance = lieuDeNaissance;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
   
}
