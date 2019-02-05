package sameer.springframework.stpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sameer.springframework.stpetclinic.services.VetService;

@Controller()
//@RequestMapping("vets")
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"vets", "/vets", "/vets/index", "/vets/index.html", "/vets.html"})
	public String listVets(Model model) {
		System.out.println(vetService.findAll());
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
