package br.com.campanha.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/campanha")
public class CampanhaController {
	
	
	@GetMapping(value="/all")
	public void getCampanha(){
		
		
		 
	}
	
}
