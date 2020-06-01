package com.Tourisme.microTourisme.Model.Services;

import com.Tourisme.microTourisme.Model.Services.Repository.ParticipationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ParticipationService {
    public final ParticipationRepository participationRepository;
    public ParticipationService(ParticipationRepository participationRepository){
        this.participationRepository=participationRepository;
    }
    public void ParticipationEnregistree(Participation participation){
            /*participationRepository.Enregistrer(participation);*/
    	participationRepository.saveAndFlush(participation);
    }
}
