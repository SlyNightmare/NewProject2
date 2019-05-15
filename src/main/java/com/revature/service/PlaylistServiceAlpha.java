package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Music;
import com.revature.model.Playlist;
import com.revature.repository.MusicRepository;
import com.revature.repository.PlaylistRepository;

@Service("playlistService")
@Transactional
public class PlaylistServiceAlpha implements PlaylistService {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(PlaylistServiceAlpha.class);

	@Autowired
	private PlaylistRepository playlistRepository;
	
	@Autowired
	private MusicRepository musicRepository;

	public PlaylistServiceAlpha() {

	}

	@Override
	public void updatePlaylist(int id, Playlist playlist) {
		playlistRepository.updatePlaylist(id, playlist);

	}

	@Override
	public void deletePlaylist(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int save(Playlist playlist) {
		return playlistRepository.save(playlist);
	}

	@Override
	public Playlist findbyName(String name) {
		return playlistRepository.findbyName(name);
	}

	@Override
	public List<Playlist> findAllPlaylistsByUserId(int accountId) {
		return playlistRepository.findAllPlaylistsByUserId(accountId);
	}


	
}
