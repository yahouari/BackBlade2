package com.Tourisme.microTourisme.Model.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.Tourisme.microTourisme.Model.Services.Voyageur;

@CrossOrigin("*")
public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {

	
	public Voyageur findByMailContains(String ml);
	
	public Voyageur findByIdVoyageurContains(int i);
}
