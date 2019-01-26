package sameer.springframework.stpetclinic.model;

public class Specialty extends BaseEntity {	

	private static final long serialVersionUID = 9106108380399046588L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
