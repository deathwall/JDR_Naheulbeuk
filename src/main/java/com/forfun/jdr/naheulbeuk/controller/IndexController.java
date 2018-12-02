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
    
    /**
     * Default application mapping
     * @param model
     * @return
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
    	
    	//content to display = name of the html page in the views repository
    	model.addAttribute("content", "welcome");
    	
    	//default return to the index page
    	return "index";
    }
 
    /**
     * Call from menu bar, choose to diplay the characters division
     * @param model, map containing all the data accessible from the view
     * @return String, name of the view to call, index by default
     */
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {
    	
    	//content to display = name of the html page in the views repository
    	model.addAttribute("content", "personList");
    	
    	//model feeding for the targeted page
    	persons.clear();
    	persons.addAll(playerService.getAllPlayers());
        model.addAttribute("persons", persons);
        
        //default return to the index page
        return "index";
    }
    
    /**
     * Call from menu bar, choose to diplay the story division
     * @param model, map containing all the data accessible from the view
     * @return String, name of the view to call, index by default
     */
    @RequestMapping(value = { "/story" }, method = RequestMethod.GET)
    public String story(Model model) {
    	
    	//content to display = name of the html page in the views repository
    	model.addAttribute("content", "story");
    	
    	//model feeding for the targeted page

    	
        //default return to the index page
        return "index";
    }
 
}