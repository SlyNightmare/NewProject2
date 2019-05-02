package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Music;

public interface MusicController {
	
	public Music getSong (Music music);
	public Music getAlbum (Music music);
	public Music getArtist (Music music);

}
