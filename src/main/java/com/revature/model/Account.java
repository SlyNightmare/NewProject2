package com.revature.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table (name="ACCOUNT")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="accountSequence")
	@SequenceGenerator(name="accountSequence", sequenceName="ACCOUNT_SEQ", allocationSize=1)
	@Column(name="A_ID")
	private int id;
	
	@Column(name="A_USERNAME")
	private String username;
	
	@Column(name="A_PASSWORD")
	private String password;
	
	//@OneToMany(cascade = CascadeType.ALL,  fetch = FetchType.EAGER, mappedBy = "account")
	//private Set<Playlist> playlists = new HashSet<>();

	public Account () {}
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Account(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password 
				+ "]";
	}


	
	
	
	
	
}
