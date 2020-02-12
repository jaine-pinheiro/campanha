package br.com.campanha.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campanha.document.Campanha;
import br.com.campanha.repository.CampanhaRepository;

@Service
public class CampanhaRepositoryImpl {
	
	@Autowired
	CampanhaRepository campanhaRepository;
	
	public List<Campanha> selecionarCampanhas(){
		return null;
	}
}
