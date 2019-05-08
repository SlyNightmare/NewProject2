package com.revature.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Playlist;
import com.revature.repository.PlaylistRepository;

@Service("playlistService")
public class PlaylistServiceAlpha implements PlaylistService {

	private static Logger logger = Logger.getLogger(PlaylistServiceAlpha.class);
	
	@Autowired
	private PlaylistRepository playlistRepository;
	
	public PlaylistServiceAlpha() {
		
	}
	
	@Override
	public boolean registerPlaylist(Playlist playlist) {
		playlistRepository.save(playlist);
		return playlist.getId() !=0;
	}

	@Override
	public Playlist getPlaylist(String name) {
		return playlistRepository.findbyName(name);
	}

}
