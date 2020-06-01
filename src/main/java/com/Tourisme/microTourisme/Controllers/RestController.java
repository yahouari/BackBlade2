package com.Tourisme.microTourisme.Controllers;


import com.Tourisme.microTourisme.Model.Services.Favoris;
import com.Tourisme.microTourisme.Model.Services.Parpff;
import com.Tourisme.microTourisme.Model.Services.Participation;
import com.Tourisme.microTourisme.Model.Services.Voyage;
import com.Tourisme.microTourisme.Model.Services.Voyageur;
import com.Tourisme.microTourisme.Model.Services.Repository.FavorisRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.ParpffRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.ParticipationRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageurRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@CrossOrigin("*")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private ParticipationRepository participationRepository;
    @Autowired
    private ParpffRepository parpffRepository;
    
    @Autowired
    private VoyageRepository voyageRepository;
    @Autowired
    private VoyageurRepository voyageurRepository;
    @Autowired
   	private FavorisRepository favorisRepository;
    
    @GetMapping("/voyages")
    public ArrayList<Voyage> listeVoyage(){
        return (ArrayList<Voyage>) voyageRepository.findAll();
    }
    @GetMapping("/participations")
    public ArrayList<Parpff> listeParticipation(){/*
    	Voyageur voyageur = new Voyageur();
    	Voyage voyage = new Voyage();
    	Optional<Voyageur> voyageur1;
    	
    	Optional<Voyage> voyage1 = Optional.empty() ;
    	Parpff a1 = new Parpff();
    	ArrayList<ArrayList<String> > part =   new ArrayList<ArrayList<String>>();
    	ArrayList<Participation> lang = new ArrayList<Participation>();
    	Optional<Participation> participation= Optional.empty();
    	//Participation part = new Participation();
    	lang=(ArrayList<Participation>)participationRepository.findAll();
    	
    	for (int i = 0; i < lang.size(); i++) {
    		Participation part1 =lang.get(i);
    		participation=participationRepository.findById(part1.getIdParticipation());
    		Participation part2 = participation.get();
    		voyage1=voyageRepository.findById(part2.getIdVoyage());
    		voyage=voyage1.get();
    		voyageur1=voyageurRepository.findById(part2.getIdVoyageur());
    		voyageur=voyageur1.get();
    		
    		parpffRepository.save(new Parpff(voyageur.getNom(),voyage.getDestination(),voyage.getPrix(),part2.getNombreDePersonnes(),part2.getDateParticipation()));
    		/*part.set(0, part2.getIdVoyage());
    		lang.set(i, part);
    }*/
        return (ArrayList<Parpff>) parpffRepository.findAll();
    }
    @GetMapping("/participations/{id}")
    public Optional<Participation> ParticipationById(@PathVariable Integer id){
        return participationRepository.findById(id);
    }
    
    @RequestMapping(value = "/participations/delete/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable Integer id) {
    	parpffRepository.deleteById(id);
		
	}
    @GetMapping("/voyageurs")
    public ArrayList<Voyageur> listeVoyageur(){
        return (ArrayList<Voyageur>) voyageurRepository.findAll();
    }
   
    @PostMapping("/Enregistrer-Participation")
    public Participation participationenreg(@RequestBody Map<String, String> body)
   {//Integer idParticipation =Integer.parseInt(body.get("idParticipation"));
    	Voyageur voyageur = new Voyageur();
    	Voyage voyage = new Voyage();
    	Optional<Voyageur> voyageur1;
    	Optional<Voyage> voyage1 = Optional.empty() ;
    	Parpff a1 = new Parpff();
    	String mail=(body.get("mail"));
    	String destination=(body.get("destination"));
       int nombreDePersonnes=Integer.parseInt(body.get("nombreDePersonnes"));
       voyageur=voyageurRepository.findByMailContains(mail);
       voyage=voyageRepository.findByDestinationContains(destination);
		parpffRepository.save(new Parpff(voyageur.getNom(),voyage.getDestination(),voyage.getPrix(),nombreDePersonnes));
       return participationRepository.save(new Participation(voyage.getIdVoyage(),voyageur.getIdVoyageur(),nombreDePersonnes));
   }
    
    
    @GetMapping("/favoris")
    @ResponseBody
    public ArrayList<Favoris> idvoy(@RequestParam("mail") String mail){
    Voyageur voyageur = new Voyageur();
    voyageur=voyageurRepository.findByMailContains(mail);
	return (ArrayList<Favoris>) favorisRepository.findAllByIdVoyageur(voyageur.getIdVoyageur());
  }
	@GetMapping("/favoriss")
    public ArrayList<Favoris> listeFavoris(){
	    return (ArrayList<Favoris>) favorisRepository.findAll();
  }
    @RequestMapping(value = "/favoris/delete/{id}" , method = RequestMethod.DELETE)
    @ResponseBody
    public void delete2(@PathVariable Integer id) {
	    favorisRepository.deleteById(id);
    }

    @PostMapping("/favoris")
     public Favoris  favorissave(@RequestBody Map<String, String> body) {
        Voyage voyage = new Voyage();
        Voyageur voyageur = new Voyageur();
        String destination=(body.get("destination"));
        String mail=body.get("mail");
        String nom_favoris=(body.get("nom_favoris"));
        voyageur=voyageurRepository.findByMailContains(mail);
        voyage=voyageRepository.findByDestinationContains(destination);
        return favorisRepository.save(new Favoris(voyage.getIdVoyage(),voyageur.getIdVoyageur(),nom_favoris,voyage.getDescription(),voyage.getPrix(),voyageur.getMail()) );
    }
    
    
    
    //private ParticipationService participationService;
  
   /* @GetMapping("/")

    public String Hello(){
        return "Hello world!";
    }*/
    /*@PostMapping("/Enregistrer-Participation")
     public Participation participationenreg(@RequestBody Map<String, String> body)
    {//Integer idParticipation =Integer.parseInt(body.get("idParticipation"));
        int idVoyageur =Integer.parseInt(body.get("idVoyageur"));
        int idVoyage=Integer.parseInt(body.get("idVoyage"));
        int nombreDePersonnes =Integer.parseInt(body.get("nombreDePersonnes"));
        return participationRepository.save(new Participation(idVoyage,idVoyageur,nombreDePersonnes));
    }*/
    
    
    
/*
    @GetMapping("/Participation")
    public String participationenreg(
    		@RequestParam int idDestination,
       @RequestParam int idVoyageur,
       @RequestParam int compteBancaire,
       @RequestParam int nombreDePersonnes ){
        Participation participation = new Participation(idDestination,idVoyageur,nombreDePersonnes,compteBancaire);
        participationService.ParticipationEnregistree(participation);
        return "Participation effectuee";
    }*/}
