package sameer.springframework.stpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = -7547450199930984012L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
