package com.Tourisme.microTourisme.Model.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.web.bind.annotation.CrossOrigin;
import com.Tourisme.microTourisme.Model.Services.Voyage;

@CrossOrigin("*")

public interface VoyageRepository extends JpaRepository<Voyage,Integer> {
	
	public Voyage findByDestinationContains(String dest);
	public Voyage findByIdVoyageContains(int i);

}
