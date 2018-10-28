package com.forfun.jdr.naheulbeuk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.forfun.jdr.naheulbeuk.model.Player;
import com.forfun.jdr.naheulbeuk.service.PlayerService;
 
@Controller
public class IndexController {
 
	//*********** ATTRIBUTES ***************
	
    private static List<Player> persons = new ArrayList<Player>();
    
    @Autowired
    PlayerService playerService;
 
    //*********** MAPPING ***************
    
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
    	persons.addAll(playerService.getAllPlayers());
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "personList";
    }
 
}