package sameer.springframework.stpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import sameer.springframework.stpetclinic.model.Vet;
import sameer.springframework.stpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet vet) {
		return super.save(vet);
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();		
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);		
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

}
