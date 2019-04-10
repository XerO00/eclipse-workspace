package org.koushik.javabrains.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.mapping.Array;

@Entity
@Table(name="VEHICLE_DETAILS")
public class Vehicle {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToMany(mappedBy="vehicle") @GeneratedValue(strategy=GenerationType.AUTO)	
    @Column(name="USER_VEHICLE_ID")
	private Collection <UserDetails> userList= new ArrayList<UserDetails>();
	
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
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
