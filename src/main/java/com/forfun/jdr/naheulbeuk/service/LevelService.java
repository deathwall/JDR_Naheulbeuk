package com.forfun.jdr.naheulbeuk.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forfun.jdr.naheulbeuk.data.LevelRepository;
import com.forfun.jdr.naheulbeuk.model.Level;

@Service
public class LevelService {

	@Autowired
	LevelRepository levelRepository;
	
	public Collection<Level> getAllLevel(){
		return levelRepository.findAll();
	}
}
