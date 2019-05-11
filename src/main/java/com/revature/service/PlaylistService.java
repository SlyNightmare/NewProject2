package com.revature.service;

import java.util.List;

import com.revature.model.Playlist;

public interface PlaylistService {

	//saving the playlist
		int save(Playlist playlist);
		//get by name
		Playlist findbyName (String name);
		//get all playlists by user name
		List<Playlist> findAllPlaylists(int accountId);
		//
		//Playlist createPlaylist(String name);
		//update the playlist
		void updatePlaylist(int id, Playlist playlist);
		//delete the playlist
		void deletePlaylist(int id);
}
