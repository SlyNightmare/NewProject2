package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MUSIC")
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musicSequence")
	@SequenceGenerator(name = "musicSequence", sequenceName = "MUSIC_SEQ", allocationSize = 1)
	@Column(name = "M_ID")
	private int id;
	
	@Column(name="TRACK_NAME")
	private String trackName;
	
	@Column(name="ARTIST")
	private String artistName;
	
	@Column(name="ALBUM")
	private String albumName;
	
	@Column(name="URL")
	private String externalURL;
	
	@Column(name="PLAYLIST_ID")
	private int playlistId;

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String trackName, String artistName, String albumName, String externalURL) {
		super();
		this.trackName = trackName;
		this.artistName = artistName;
		this.albumName = albumName;
		this.externalURL = externalURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getExternalURL() {
		return externalURL;
	}

	public void setExternalURL(String externalURL) {
		this.externalURL = externalURL;
	}

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", trackName=" + trackName + ", artistName=" + artistName + ", albumName="
				+ albumName + ", externalURL=" + externalURL + ", playlistId=" + playlistId + "]";
	}

	
	
	

}
