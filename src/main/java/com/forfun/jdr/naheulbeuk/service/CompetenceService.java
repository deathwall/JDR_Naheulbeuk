package com.forfun.jdr.naheulbeuk.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forfun.jdr.naheulbeuk.data.CompetenceRepository;
import com.forfun.jdr.naheulbeuk.model.Competence;

@Service
public class CompetenceService {

	@Autowired
	CompetenceRepository competenceRepository;
	
	public Collection<Competence> getAllCompetence(){
		return competenceRepository.findAll();
	}
	
	/**
	 * Retrieve competences of a player using the character name 
	 * @param persoName
	 * @return Collection<Competence>, list of all competences of a player
	 */
	public List<Competence> getAllCompetenceforPlayer(String persoName){
		
		List<Competence> competencesForPlayer = competenceRepository.findAll().stream()
			    .filter(p -> p.getJoueur().equalsIgnoreCase(persoName))
			    .collect(Collectors.toList());
		
		Collections.sort(competencesForPlayer);
		
		return competencesForPlayer; 
	}
	
}
