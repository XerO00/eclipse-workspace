package org.koushik.javabrains.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
	private int userId;
    
    @Column(name="USER_NAME")
	private String userName;
    
    
    private Set <Address> listOfAddresses=  new HashSet<Address>();
	
    @Temporal(TemporalType.DATE)
    @Column(name="USER_JOININGDATE")
	private Date JoiningDate;
	
	//@Transient     This tell Hibernate to not to use this column into table structure
	@Embedded
	private Address HomeAddress;
	
	@Embedded
	@AttributeOverrides({ 
    @AttributeOverride (name="City",column=@Column(name="USER_OFFICE_CITY")),
    @AttributeOverride (name="State",column=@Column(name="USER_OFFICE_STATE")) })
	private Address OfficeAddress;

	@Column(name="USER_DESCRIPTION")
	@Lob
	private String Description;
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Address getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(org.koushik.javabrains.dto.Address address) {
		HomeAddress = address;
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

	
	public Address getOfficeAddress() {
		return OfficeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		OfficeAddress = officeAddress;
	}

}
