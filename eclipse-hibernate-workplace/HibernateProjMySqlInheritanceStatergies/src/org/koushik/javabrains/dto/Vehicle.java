package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="VEHICLE_DETAILS1")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {

	@Id 
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}

/*
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(   name="VEHICLE_TYPE",
		                discriminatorType=DiscriminatorType.STRING
                      		                                    )
                      		                                    
                      		                                    */