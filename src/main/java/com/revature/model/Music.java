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

	@Column(name = "M_TITLE")
	private String title;

	@Column(name = "M_ARTIST")
	private String artist;

	@Column(name = "M_GENRE")
	private String genre;

	@Column(name = "M_ALBUM")
	private String album;

	public Music() {
	}

	public Music(int id, String title, String artist, String genre, String album) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.album = album;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", title=" + title + ", artist=" + artist + ", genre=" + genre + ", album=" + album
				+ "]";
	}

}
