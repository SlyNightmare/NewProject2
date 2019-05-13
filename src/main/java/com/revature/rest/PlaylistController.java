package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Music;
import com.revature.model.Playlist;

public interface PlaylistController {

	//ResponseEntity<List<Playlist>> getAllPlaylists(int accountId);
	ResponseEntity<List<Playlist>> getAllPlaylistsByUserId(HttpServletRequest request);
	ResponseEntity<?> createPlaylist(Playlist playlist);
	ResponseEntity<Music> getSong(String trackName);
	ResponseEntity<Playlist> getPlaylistByName(String name);
}
