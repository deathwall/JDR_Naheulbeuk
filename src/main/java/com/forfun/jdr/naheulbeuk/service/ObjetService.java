package com.forfun.jdr.naheulbeuk.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forfun.jdr.naheulbeuk.data.ObjetRepository;
import com.forfun.jdr.naheulbeuk.model.Objet;

@Service
public class ObjetService {

	@Autowired
	ObjetRepository objetRepository;
	
	public Collection<Objet> getAllLevel(){
		return objetRepository.findAll();
	}
	
	public List<Objet> getAllObjectforPlayer(String persoName){
		
		List<Objet> objetsForPlayer = objetRepository.findAll().stream()
			    .filter(p -> p.getJoueur().equalsIgnoreCase(persoName))
			    .collect(Collectors.toList());
		
		System.out.println("liste d'objet");
		System.out.println(objetsForPlayer);
		
		Collections.sort(objetsForPlayer);
		
		return objetsForPlayer;
	}
}
