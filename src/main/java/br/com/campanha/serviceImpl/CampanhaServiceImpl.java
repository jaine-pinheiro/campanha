package br.com.campanha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campanha.repository.CampanhaRepository;
import br.com.campanha.service.CampanhaService;

@Service
public class CampanhaServiceImpl implements CampanhaService {
	
	@Autowired
	CampanhaRepository campanhaRepository;

	
	
}
