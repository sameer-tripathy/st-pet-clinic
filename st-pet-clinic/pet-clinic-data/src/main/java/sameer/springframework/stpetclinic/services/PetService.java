package sameer.springframework.stpetclinic.services;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
