package com.revature.service;

import com.revature.model.Music;

public interface MusicService {

	public Music getSong (String title);
	public Music getAlbum (String album);
	public Music getArtist (String artist);
}
