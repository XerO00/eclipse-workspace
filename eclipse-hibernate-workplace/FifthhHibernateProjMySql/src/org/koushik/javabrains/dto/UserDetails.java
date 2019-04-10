package org.koushik.javabrains.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
	private int userId;
    
    @Column(name="USER_NAME")
	private String userName;
    
	@Temporal(TemporalType.DATE)
    @Column(name="USER_JOININGDATE")
	private Date JoiningDate;
	
	//@Transient   //  This tell Hibernate to not to use this column into table structure
	@Column(name="USER_ADDRESS")
	private String Address;
	
	@Column(name="USER_DESCRIPTION")
	@Lob
	private String Description;
	
    @ElementCollection
    @JoinTable(name="USER_DETAILS_ADDRESSES",
               joinColumns=@JoinColumn(name="USER_DETAILS_ADDRESSES_ID")
    		)
    private Collection<Address> listOfAddresses = new ArrayList<Address>();
	
	public Collection<org.koushik.javabrains.dto.Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	//@Column(name="USER_ID")-We can use on getters as well
	public int getId() {
		System.out.println("getID" + userId);
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
		System.out.println("setID"+ id);
	}
	//@Column(name="USER_NAME")  -We can use on getters as well
	public String getUserName() {
		System.out.println("getName "+userName);
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("SetName "+userName);
		this.userName = userName;
	}
	public Date getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}

}
