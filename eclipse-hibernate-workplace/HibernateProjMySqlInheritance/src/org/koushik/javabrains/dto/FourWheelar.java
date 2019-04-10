package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class FourWheelar extends Vehicle {

	@Column(name="FOURWHEEL")
	private String FourWheelType;

	public String getFourWheelType() {
		return FourWheelType;
	}

	public void setFourWheelType(String fourWheelType) {
		FourWheelType = fourWheelType;
	}
}
