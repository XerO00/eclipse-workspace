package org.koushik.javabrains.dto;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name="USER_DETAILS")
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)//useful to avoid unnecessary updates
//@NamedQuery(name = "UserDetails.byId", query = "select userName from UserDetails where userId=?") 
//@NamedNativeQuery(name = "UserDetails.byName", query = "select * from USER_DETAILS where USER_NAME=?",resultClass=UserDetails.class)
public class UserDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
	private int userId;
    
    @Column(name="USER_NAME")
	private String userName;
	
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
