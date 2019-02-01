package sameer.springframework.stpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sameer.springframework.stpetclinic.model.Owner;
import sameer.springframework.stpetclinic.model.Pet;
import sameer.springframework.stpetclinic.model.PetType;
import sameer.springframework.stpetclinic.model.Specialty;
import sameer.springframework.stpetclinic.model.Vet;
import sameer.springframework.stpetclinic.services.OwnerService;
import sameer.springframework.stpetclinic.services.PetTypeService;
import sameer.springframework.stpetclinic.services.SpecialtyService;
import sameer.springframework.stpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
		
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
	}

	public void run(String... args) throws Exception {
		int count  = petTypeService.findAll().size();
		
		if(count == 0) {
			loadData();
		}
	}

	private void loadData() {
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
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		
		owner1.getPets().add(mikesPet);
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glemanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");
		
		Pet fionaPet = new Pet();
		fionaPet.setPetType(savedCatPetType);
		fionaPet.setOwner(owner2);
		fionaPet.setBirthDate(LocalDate.now());
		fionaPet.setName("FionaCat");
		
		owner2.getPets().add(fionaPet);
		ownerService.save(owner2);
		
		System.out.println("DataLoader: Loaded Owners");
		
		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtyService.save(radiology);		
		
		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = specialtyService.save(surgery);
		
		Specialty dentistry = new Specialty();
		dentistry.setDescription("Dentistry");
		Specialty savedDentistry = specialtyService.save(dentistry);
		
		System.out.println("DataLoader: Loaded Spcialties");
		
		Vet vet1= new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialties().add(savedRadiology);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialties().add(savedSurgery);
		vetService.save(vet2);
		
		System.out.println("DataLoader: Loaded Vets");
	}
}
