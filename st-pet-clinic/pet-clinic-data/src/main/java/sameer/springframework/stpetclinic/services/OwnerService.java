package sameer.springframework.stpetclinic.services;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
