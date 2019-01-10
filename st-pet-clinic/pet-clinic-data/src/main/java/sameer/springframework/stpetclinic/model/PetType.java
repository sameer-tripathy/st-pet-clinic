package sameer.springframework.stpetclinic.model;

public class PetType extends BaseEntity{
	
	private static final long serialVersionUID = 247102153099365702L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
