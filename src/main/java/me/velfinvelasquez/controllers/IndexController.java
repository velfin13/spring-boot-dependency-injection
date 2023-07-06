package me.velfinvelasquez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import me.velfinvelasquez.models.service.Iservice;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("MyServicioComplejo")
	private Iservice myservice;
	
	@GetMapping({ "/", "index", "/home" })
	public String index(Model model) {
		model.addAttribute("objeto", myservice.operacion());
		return "index";
	}

}
