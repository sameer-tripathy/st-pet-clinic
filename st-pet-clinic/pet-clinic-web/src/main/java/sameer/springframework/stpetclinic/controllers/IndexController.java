package sameer.springframework.stpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping({"", "/", "/index", "/index.html"}) //class level is fine but it is required to add the requestMapping at the method level too. class level should be containing part of the URI.
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/oups")
	public String findOwners() {
		return "notimplemented";
	}

}
