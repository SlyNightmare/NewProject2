package com.revature.service;

import com.revature.model.Playlist;

public interface PlaylistService {

	public boolean registerPlaylist(Playlist playlist);
	//List<Playlist> getAllPlaylists();
	public Playlist getPlaylist (String name);
}
