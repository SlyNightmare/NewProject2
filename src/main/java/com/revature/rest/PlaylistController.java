package com.revature.rest;

import com.revature.ajax.ClientMessage;
import com.revature.model.Playlist;
import javax.servlet.http.HttpServletRequest;

public interface PlaylistController {

	ClientMessage registerPlaylist(Playlist playlist);
	//list<Playlist> findAllPlaylists();
	Playlist findPlaylist (Playlist playlist, HttpServletRequest request);
}
