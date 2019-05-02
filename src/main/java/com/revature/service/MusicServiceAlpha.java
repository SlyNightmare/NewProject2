package com.revature.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.model.Music;
import com.revature.repository.MusicRepository;

public class MusicServiceAlpha implements MusicService {

	private static Logger logger = Logger.getLogger(MusicServiceAlpha.class);
	
	@Autowired
	private MusicRepository musicRepository;
	
	public MusicServiceAlpha() {}
	
	public MusicServiceAlpha(MusicRepository musicRepository) {
		logger.trace("Constructor Injection");
		this.musicRepository=musicRepository;
	}
	
	@Override
	public Music getSong(String name) {
		return musicRepository.findByTitle(name);
	}

	@Override
	public Music getAlbum(String name) {
		return musicRepository.findByAlbum(name);
	}

	@Override
	public Music getArtist(String name) {
	return musicRepository.findByArtist(name);
	}

}
