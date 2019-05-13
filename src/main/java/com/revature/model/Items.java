package com.revature.model;

import java.util.Arrays;

public class Items {
	
	private Album album;
	private Artists[] artists;
	private long disc_number;
	private long duration_ms;
	private boolean explicit;
	private External_Ids external_ids;
	private External_Urls external_urls;
	private String href;
	private String id;
	private boolean is_local;
	private boolean is_playable;
	private String name;
	private long popularity;
	private String previous_url;
	private long track_number;
	private String type;
	private String uri;
	
	public Items() {}

	public Items(Album album, Artists[] artists, long disc_number, long duration_ms, boolean explicit,
			External_Ids external_ids, External_Urls external_urls, String href, String id, boolean is_local,
			boolean is_playable, String name, long popularity, String previous_url, long track_number, String type,
			String uri) {
		super();
		this.album = album;
		this.artists = artists;
		this.disc_number = disc_number;
		this.duration_ms = duration_ms;
		this.explicit = explicit;
		this.external_ids = external_ids;
		this.external_urls = external_urls;
		this.href = href;
		this.id = id;
		this.is_local = is_local;
		this.is_playable = is_playable;
		this.name = name;
		this.popularity = popularity;
		this.previous_url = previous_url;
		this.track_number = track_number;
		this.type = type;
		this.uri = uri;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artists[] getArtists() {
		return artists;
	}

	public void setArtists(Artists[] artists) {
		this.artists = artists;
	}

	public long getDisc_number() {
		return disc_number;
	}

	public void setDisc_number(long disc_number) {
		this.disc_number = disc_number;
	}

	public long getDuration_ms() {
		return duration_ms;
	}

	public void setDuration_ms(long duration_ms) {
		this.duration_ms = duration_ms;
	}

	public boolean isExplicit() {
		return explicit;
	}

	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}

	public External_Ids getExternal_ids() {
		return external_ids;
	}

	public void setExternal_ids(External_Ids external_ids) {
		this.external_ids = external_ids;
	}

	public External_Urls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(External_Urls external_urls) {
		this.external_urls = external_urls;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isIs_local() {
		return is_local;
	}

	public void setIs_local(boolean is_local) {
		this.is_local = is_local;
	}

	public boolean isIs_playable() {
		return is_playable;
	}

	public void setIs_playable(boolean is_playable) {
		this.is_playable = is_playable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopularity() {
		return popularity;
	}

	public void setPopularity(long popularity) {
		this.popularity = popularity;
	}

	public String getPrevious_url() {
		return previous_url;
	}

	public void setPrevious_url(String previous_url) {
		this.previous_url = previous_url;
	}

	public long getTrack_number() {
		return track_number;
	}

	public void setTrack_number(long track_number) {
		this.track_number = track_number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Items [album=" + album + ", artists=" + Arrays.toString(artists) + ", disc_number=" + disc_number
				+ ", duration_ms=" + duration_ms + ", explicit=" + explicit + ", href=" + href + ", id=" + id
				+ ", is_local=" + is_local + ", is_playable=" + is_playable + ", name=" + name + ", popularity="
				+ popularity + ", previous_url=" + previous_url + ", track_number=" + track_number + ", type=" + type
				+ ", uri=" + uri + "]";
	}
	
	
	
	
	
	
}
