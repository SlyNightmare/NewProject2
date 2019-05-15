package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.model.APIObject;
import com.revature.model.Music;
import com.revature.model.Playlist;
import com.revature.service.PlaylistService;

@RestController("playlistController")
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/music", produces=MediaType.APPLICATION_JSON_VALUE)
public class PlaylistControllerAlpha implements PlaylistController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(PlaylistControllerAlpha.class);
	private static final String authorizationToken = "BQBdwn86R2-pPK5WTo78uf7olaPWYHSJVItKi0ND0jtInfJh-__dUZLLguRHO_REkqbV49g9qCWA6S5XIqLVBl1scZ54wlzk8P5NwFPLhFc-PNJxIgxWjACTAVUA2WKqPLuJ9XEQ8ifO1M6J1744Wio";
	@Autowired
	private RestTemplate restTemplate;
	private static final HttpHeaders headers = new HttpHeaders();

	@Autowired
	private PlaylistService playlistService;

	
	//Getting all Playlists 
	@GetMapping(value = "/playlists", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Playlist>> getAllPlaylistsByUserId(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
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

	//public @ResponseBody ResponseEntity<Music> getSong(@PathVariable("trackname") String trackName)
	
	
	
	

}
