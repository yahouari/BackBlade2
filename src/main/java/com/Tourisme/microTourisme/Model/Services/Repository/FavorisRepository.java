package com.Tourisme.microTourisme.Model.Services.Repository;


import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Tourisme.microTourisme.Model.Services.Favoris;

@CrossOrigin("*")

public interface FavorisRepository extends JpaRepository<Favoris,Integer> {

	
	public ArrayList<Favoris> findAllByIdVoyageur(int i);
}

