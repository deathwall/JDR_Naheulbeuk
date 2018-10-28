package com.forfun.jdr.naheulbeuk.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forfun.jdr.naheulbeuk.data.PlayerRepository;
import com.forfun.jdr.naheulbeuk.model.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	public Collection<Player> getAllPlayers(){
		return playerRepository.findAll();
	}
	
}
