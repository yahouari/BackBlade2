package com.Tourisme.microTourisme.Model.Services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evaluation")

public class Evaluation{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEvaluation;
	private int idVoyage;
	private int idVoyageur;
    private String noteVoyage;
    private String noteGuide;
    private String noteService;
    private String refaireExperience;
    private String mot;
	public Integer getIdEvaluation() {
		return idEvaluation;
	}
	public void setIdEvaluation(Integer idEvaluation) {
		this.idEvaluation = idEvaluation;
	}
	public int getIdVoyage() {
		return idVoyage;
	}
	public void setIdVoyage(int idVoyage) {
		this.idVoyage = idVoyage;
	}
	public int getIdVoyageur() {
		return idVoyageur;
	}
	public void setIdVoyageur(int idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	public String getNoteVoyage() {
		return noteVoyage;
	}
	public void setNoteVoyage(String noteVoyage) {
		this.noteVoyage = noteVoyage;
	}
	public String getNoteGuide() {
		return noteGuide;
	}
	public void setNoteGuide(String noteGuide) {
		this.noteGuide = noteGuide;
	}
	public String getNoteService() {
		return noteService;
	}
	public void setNoteService(String noteService) {
		this.noteService = noteService;
	}
	public String getRefaireExperience() {
		return refaireExperience;
	}
	public void setRefaireExperience(String refaireExperience) {
		this.refaireExperience = refaireExperience;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
   
}
