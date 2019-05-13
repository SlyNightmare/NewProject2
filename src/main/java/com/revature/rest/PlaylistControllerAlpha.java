package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Music;
import com.revature.model.Playlist;
import com.revature.model.Tracks;
import com.revature.service.PlaylistService;

@RestController("playlistController")
@CrossOrigin(origins = "http://localhost:4200")
public class PlaylistControllerAlpha implements PlaylistController {

	private static Logger logger = Logger.getLogger(PlaylistControllerAlpha.class);
	private static final String authorizationToken = "BQBqm_A4BH6lM8GiLz8_Qc_2Z2DRV94oXiINHW9oK5joBk8UHW3G6gWuO40SZRYlvdvnFmAVwRE30qGZCri94D0b1gDNZdj7K667NydevqvV-i4QbGRht5Aqax9NCXEfWgnB-TKon69yIo0Ovleb-SM";
	private RestTemplate restTemplate = new RestTemplate();
	private static final HttpHeaders headers = new HttpHeaders();

	@Autowired
	private PlaylistService playlistService;

	
	//Getting all Playlists 
	@GetMapping(value = "/playlists", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Playlist>> getAllPlaylistsByUserId(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		//playlistService.sa
		
		List<Playlist> playlists = playlistService.findAllPlaylistsByUserId((Integer) session.getAttribute("accountId"));
		return ResponseEntity.ok(playlists);
	}
	


	@PostMapping(value = "/playlists/create")
	public ResponseEntity<?> createPlaylist(@RequestBody Playlist playlist) {
		int id = playlistService.save(playlist);
		return ResponseEntity.ok().body("Playlist created with id: " + id);
	}


	@GetMapping(value = "/playlists/{name}")
	public ResponseEntity<Playlist> getPlaylistByName(@PathVariable("name") String name) {
		Playlist playlist = playlistService.findbyName(name);
		return ResponseEntity.ok().body(playlist);
	}

	// https://api.spotify.com/v1/search?q=roadhouse%20blues&type=track


	@Override 
	@GetMapping(value="/getsong/{trackname}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Music> getSong(@PathVariable("trackname") String trackName) {
		
		headers.set("Authorization", "Bearer " + authorizationToken); 
		HttpEntity<?> entity = new HttpEntity<Object>(headers); 
		ResponseEntity<Tracks> response = restTemplate.exchange("https://api.spotify.com/v1/search?q=" + trackName +"&type=track", HttpMethod.GET, entity, Tracks.class); 
		Music music = new Music(response.getBody().getItems()[0].getName(), response.getBody().getItems()[0].getArtists()[0].getName(), response.getBody().getItems()[0].getAlbum().getName(), response.getBody().getItems()[0].getExternal_urls().getSpotify());
		return ResponseEntity.ok(music); 
	}
	
	//PostMapping
	// public ResponseEntity<> addToDatabase(@RequestBody Music music){
	// 	playlistService.save(music)
	

}
