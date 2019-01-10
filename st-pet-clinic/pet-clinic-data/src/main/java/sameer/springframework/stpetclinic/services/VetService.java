package sameer.springframework.stpetclinic.services;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
