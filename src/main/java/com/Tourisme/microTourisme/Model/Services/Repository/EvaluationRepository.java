package com.Tourisme.microTourisme.Model.Services.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;


import com.Tourisme.microTourisme.Model.Services.Evaluation;


@CrossOrigin("*")
public interface EvaluationRepository extends JpaRepository<Evaluation,Integer>  {
	
}

