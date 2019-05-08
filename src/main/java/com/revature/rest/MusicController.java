package com.revature.rest;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Music;

public interface MusicController {

	Music getTitle (Music music);
	Music getAlbum (Music music);
	Music getArtist (Music music);
}
