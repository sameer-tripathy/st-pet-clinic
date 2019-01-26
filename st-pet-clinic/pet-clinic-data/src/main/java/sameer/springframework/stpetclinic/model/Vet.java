package sameer.springframework.stpetclinic.model;

import java.util.Set;

public class Vet extends Person {

	private static final long serialVersionUID = 4674702684108238891L;
	
		private Set<Specialty> specialties;

		public Set<Specialty> getSpecialties() {
			return specialties;
		}

		public void setSpecialties(Set<Specialty> specialties) {
			this.specialties = specialties;
		}
}
