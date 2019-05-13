package com.revature.repository;

import java.util.List;

import com.revature.model.Music;

public interface MusicRepository {

	Music findByTitle(String title);
	Music findByArtist(String artist);
	Music findByAlbum(String album);
	
	List<Music> findAllTracksByPlaylistId(int playlistId);
}
