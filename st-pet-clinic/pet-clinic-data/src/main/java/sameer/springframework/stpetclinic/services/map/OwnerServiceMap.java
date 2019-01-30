package sameer.springframework.stpetclinic.services.map;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sameer.springframework.stpetclinic.model.Owner;
import sameer.springframework.stpetclinic.model.Pet;
import sameer.springframework.stpetclinic.services.OwnerService;
import sameer.springframework.stpetclinic.services.PetService;
import sameer.springframework.stpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private final PetTypeService petTypeServiceMap;
	private final PetService petService;
	
	@Autowired
	public OwnerServiceMap(PetTypeService petTypeServiceMap, PetService petService) {
		this.petTypeServiceMap = petTypeServiceMap;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner owner) {
		if(owner != null) {
			owner.getPets().forEach(pet -> {
				if(pet.getPetType() != null) {
					if(pet.getPetType().getId() == null) {
						pet.setPetType(petTypeServiceMap.save(pet.getPetType()));
					}
				} else {
					throw new RuntimeException("Pet Type is Required");
				}
				if(pet.getId() == null) {
					Pet savedPet = petService.save(pet);
					pet.setId(savedPet.getId());
				}	
			});
			
			return super.save(owner);	
		} else {
			return null;
		}
		//return super.save(owner);
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();		
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);		
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
