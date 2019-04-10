package org.koushik.javabrains.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="USER_DETAILS1")
public class UserDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
	private int userId;
    
	@Column(name="USER_NAME")
	private String userName;
	
	@OneToMany(cascade=CascadeType.PERSIST)  // This will cascade save all the vehicles object afte user saved
	@JoinColumn(name="VEHICLE_USER_ID")   
	private Collection<Vehicle> vehicle= new  ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public int getId() {
		System.out.println("getID" + userId);
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
		System.out.println("setID"+ id);
	}
	public String getUserName() {
		System.out.println("getName "+userName);
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("SetName "+userName);
		this.userName = userName;
	}

}
