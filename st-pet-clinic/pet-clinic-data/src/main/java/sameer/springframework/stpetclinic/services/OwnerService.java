package sameer.springframework.stpetclinic.services;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}
