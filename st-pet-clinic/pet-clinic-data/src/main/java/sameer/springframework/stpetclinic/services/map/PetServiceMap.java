package sameer.springframework.stpetclinic.services.map;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Pet;
import sameer.springframework.stpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet Pet) {
		return super.save(Pet.getId(), Pet);
	}
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();		
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);		
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

}
