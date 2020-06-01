package com.Tourisme.microTourisme.Model.Services.Repository;

import com.Tourisme.microTourisme.Model.Services.Participation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ParticipationRepository extends JpaRepository<Participation,Integer> {
}
