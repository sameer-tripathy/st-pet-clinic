package sameer.springframework.stpetclinic.services.map;

import java.util.Set;

import sameer.springframework.stpetclinic.model.Vet;
import sameer.springframework.stpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet Vet) {
		return super.save(Vet.getId(), Vet);
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
