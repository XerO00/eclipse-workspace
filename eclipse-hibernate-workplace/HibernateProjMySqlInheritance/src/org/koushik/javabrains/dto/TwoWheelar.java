package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class TwoWheelar extends Vehicle {

	@Column(name="TWOWHEEL")
	private String TwoWheelType;

	public String getTwoWheelType() {
		return TwoWheelType;
	}

	public void setTwoWheelType(String twoWheelType) {
		TwoWheelType = twoWheelType;
	}

}
