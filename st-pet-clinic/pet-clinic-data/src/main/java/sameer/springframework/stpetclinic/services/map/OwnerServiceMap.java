package sameer.springframework.stpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import sameer.springframework.stpetclinic.model.Owner;
import sameer.springframework.stpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner owner) {
		return super.save(owner);
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
