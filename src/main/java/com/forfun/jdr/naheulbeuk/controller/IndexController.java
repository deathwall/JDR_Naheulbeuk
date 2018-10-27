package com.forfun.jdr.naheulbeuk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.forfun.jdr.naheulbeuk.form.PlayerForm;
import com.forfun.jdr.naheulbeuk.model.Player;
 
@Controller
public class IndexController {
 
    private static List<Player> persons = new ArrayList<Player>();
 
    // Injectez (inject) via application.properties.
    @Value("${welcome.message}")
    private String message;
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        model.addAttribute("message", message);
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "personList";
    }
 
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
    public String showAddPersonPage(Model model) {
 
        PlayerForm personForm = new PlayerForm();
        model.addAttribute("personForm", personForm);
 
        return "addPerson";
    }
 
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    public String savePerson(Model model, @ModelAttribute("personForm") PlayerForm personForm) {
 
        String firstName = personForm.getFirstName();
        String lastName = personForm.getLastName();
 
        Player newPerson = new Player(firstName, lastName);
        persons.add(newPerson);

        return "redirect:/personList";
    }
 
}