package br.com.campanha.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import br.com.campanha.document.Campanha;

@Repository
public interface CampanhaRepository extends ReactiveMongoRepository<Campanha, Long> {

	List<Campanha> findByDataInicio(); // usar o between na dada inicio e data fim no nome do metodo
	
}
