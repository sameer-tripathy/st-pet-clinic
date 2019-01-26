package sameer.springframework.stpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sameer.springframework.stpetclinic.model.Owner;
import sameer.springframework.stpetclinic.model.PetType;
import sameer.springframework.stpetclinic.model.Vet;
import sameer.springframework.stpetclinic.services.OwnerService;
import sameer.springframework.stpetclinic.services.PetTypeService;
import sameer.springframework.stpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
		
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		System.out.println("DataLoader: Loaded PetTypes");
		
		Owner owner1 = new Owner();    
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fianna");
		owner2.setLastName("Glemanne");
		ownerService.save(owner2);
		
		System.out.println("DataLoader: Loaded Owners");
		
		Vet vet1= new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("DataLoader: Loaded Vets");
	}

}
