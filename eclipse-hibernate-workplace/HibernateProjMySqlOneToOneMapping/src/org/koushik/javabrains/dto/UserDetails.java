package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS1")
public class UserDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
	private int userId;
    
	@Column(name="USER_NAME")
	private String userName;
	
	@OneToOne
	@JoinColumn(name="VEHICLE_USER_ID")
	private  Vehicle vehicle;
	
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
