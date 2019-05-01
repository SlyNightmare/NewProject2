package com.revature.repository;

import com.revature.model.Playlist;

public interface PlaylistRepository {

	void save (Playlist playlist);
	//Playlist findbyUserId(int userId)
	Playlist findbyName (String name);
	
}
