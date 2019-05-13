package com.revature.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYLIST")
public class Playlist {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="playlistSequence")
	@SequenceGenerator(name="playlistSequence", sequenceName="PLAYLIST_SEQ", allocationSize=1)
	@Column(name="P_ID")
	private int id;
	
	@Column(name="P_NAME")
	private String name;
	
	@Column(name="ACCOUNT_ID")
	private int accountId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PLAYLIST_TRACKS", 
				joinColumns = {
						@JoinColumn(name="P_ID")
				}, inverseJoinColumns = {
						@JoinColumn(name="M_ID")
				}
	)
	private Set<Music> tracks = new HashSet<>();
	
	public Playlist() {}

	public Playlist(int id, String name, int accountId, Set<Music> tracks) {
		super();
		this.id = id;
		this.name = name;
		this.accountId = accountId;
		this.tracks = tracks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Set<Music> getTracks() {
		return tracks;
	}

	public void setTracks(Set<Music> tracks) {
		this.tracks = tracks;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", accountId=" + accountId + ", tracks=" + tracks + "]";
	}
	
	
	
}
