package sameer.springframework.stpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sameer.springframework.stpetclinic.model.Owner;
import sameer.springframework.stpetclinic.model.Vet;
import sameer.springframework.stpetclinic.services.OwnerService;
import sameer.springframework.stpetclinic.services.VetService;
import sameer.springframework.stpetclinic.services.map.OwnerServiceMap;
import sameer.springframework.stpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
		
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fianna");
		owner2.setLastName("Glemanne");
		ownerService.save(owner2);
		
		System.out.println("DataLoader: Loaded Owners");
		
		Vet vet1= new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("DataLoader: Loaded Vets");
	}

}
