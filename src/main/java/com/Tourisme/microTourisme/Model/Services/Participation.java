package com.Tourisme.microTourisme.Model.Services;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;



@Entity
@Table(name = "participation")

public class Participation {
    @Id
	@Column(name="idParticipation")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idParticipation;
    private int idVoyage;
    private int idVoyageur;
    private int nombreDePersonnes;
    @CreatedDate
   // @Column(name = "date_inscription", nullable = false, updatable = false)
    @Column(name = "date_participation",updatable = false)
    @CreationTimestamp
    private Date dateParticipation;

    
	 @Autowired
	 @Override
		public String toString() {
			return "Participation [idParticipation=" + idParticipation + ", idVoyage=" + idVoyage + ", idVoyageur="
					+ idVoyageur + ", nombreDePersonnes=" + nombreDePersonnes + ", dateParticipation=" + dateParticipation
					+ "]";
		}
   

   

	public Participation(int idVoyage, int idVoyageur, int nombreDePersonnes) {
		super();
		this.idVoyage = idVoyage;
		this.idVoyageur = idVoyageur;
		this.nombreDePersonnes = nombreDePersonnes;
	}




	

	public Integer getIdParticipation() {
        return idParticipation;
    }

    public void setIdParticipation(Integer idParticipation) {
        this.idParticipation = idParticipation;
    }


    public int getIdVoyageur() {
        return idVoyageur;
    }

    public void setIdVoyageur(int idVoyageur) {
        this.idVoyageur = idVoyageur;
    }

   


	public int getIdVoyage() {
		return idVoyage;
	}




	public void setIdVoyage(int idVoyage) {
		this.idVoyage = idVoyage;
	}




	public Date getDateParticipation() {
		return dateParticipation;
	}




	public void setDateParticipation(Date dateParticipation) {
		this.dateParticipation = dateParticipation;
	}




	public int getNombreDePersonnes() {
        return nombreDePersonnes;
    }

    public void setNombreDePersonnes(int nombreDePersonnes) {
        this.nombreDePersonnes = nombreDePersonnes;
    }
}
