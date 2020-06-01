package com.Tourisme.microTourisme.Model.Services;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;



@Entity
@Table(name = "Parpff")

public class Parpff  {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpff;
	private String nom;
    private String destination;
    private int prix;
    private int nombreDePersonnes;
    @Column(name = "date_participation",updatable = false)
    @CreationTimestamp
    private Date dateParticipation;

    public Parpff() {
		super();
	}

	public Integer getIdpff() {
		return idpff;
	}

	public void setIdpff(Integer idpff) {
		this.idpff = idpff;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public int getNombreDePersonnes() {
		return nombreDePersonnes;
	}

	public void setNombreDePersonnes(int nombreDePersonnes) {
		this.nombreDePersonnes = nombreDePersonnes;
	}

	public Date getDateParticipation() {
		return dateParticipation;
	}

	public void setDateParticipation(Date dateParticipation) {
		this.dateParticipation = dateParticipation;
	}

	public Parpff(String nom2, String destination2, int prix2, int nombreDePersonnes2) {
		super();
		this.nom=nom2;
		this.destination=destination2;
		this.prix=prix2;
		this.nombreDePersonnes=nombreDePersonnes2;
	}

}