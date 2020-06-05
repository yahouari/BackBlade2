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
	 private int ideval;
		private String username;
		private String destination;
		private int note;
		private String dateevaluation;
	    public Evaluation() {}
	    public Evaluation(int ideval,String destination,String username,int note,String dateevaluation)
	    {this.ideval=ideval;
	    this.destination=destination;
	    this.username=username;
	    this.note=note;
	    this.dateevaluation=dateevaluation;}
	    public int getideval() {
			return ideval;
		}
		public void setideval(int ideval) {
			this.ideval = ideval;
		}
	    
	    public String getdestination() {
			return destination;
		}
		public void setdestination(String destination) {
			this.destination = destination;
		}
		public String getusername() {
			return username;
		}
		public void setusername(String username) {
			this.username = username;
		}
		public int getnote() {
			return note;
		}
		public void setnote(int note) {
			this.note = note;
		}
		public String getdateevaluation() {
			return dateevaluation;
		}
		public void setdateevaluation(String dateevaluation) {
			this.dateevaluation=dateevaluation;
		}
		@Override
	    public String toString(){  
	        return "IdEval=" +ideval+
	        ",username=" +username+ 
	        ",destination=" +destination+ 
	        ",note="+note+",DateEvaluation="+dateevaluation+"}";
	    }
	}

