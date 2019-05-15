package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.model.APIObject;
import com.revature.model.Music;
import com.revature.service.MusicService;

@RestController("musicController")
@CrossOrigin(origins="http://localhost:4200")
public class MusicControllerAlpha implements MusicController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(MusicControllerAlpha.class);
	
	private static final String authorizationToken = "BQBdwn86R2-pPK5WTo78uf7olaPWYHSJVItKi0ND0jtInfJh-__dUZLLguRHO_REkqbV49g9qCWA6S5XIqLVBl1scZ54wlzk8P5NwFPLhFc-PNJxIgxWjACTAVUA2WKqPLuJ9XEQ8ifO1M6J1744Wio";
	@Autowired
	private RestTemplate restTemplate;
	private static final HttpHeaders headers = new HttpHeaders();

	
	@Autowired
	private MusicService musicService;

	@PostMapping("getsong/table")
	public ResponseEntity<List<Music>> getSongs(@RequestBody Music music, HttpServletRequest request) {
		//Music trackFound = musicService.getTitle(trackFound.getTrackName());
		return null;
	}
	
	@GetMapping("/getsong/{trackname}")
	public @ResponseBody ResponseEntity<Music> getSong(@PathVariable("trackname") String trackName) {
		
		headers.set("Authorization", "Bearer " + authorizationToken); 
		HttpEntity<?> entity = new HttpEntity<Object>(headers); 
		ResponseEntity<APIObject> response = restTemplate.exchange("https://api.spotify.com/v1/search?q=" + trackName +"&type=track&market=US&limit=1", HttpMethod.GET, entity, APIObject.class); 
		Music music = new Music(response.getBody().getTracks().getItems()[0].getName(), response.getBody().getTracks().getItems()[0].getArtists()[0].getName(), response.getBody().getTracks().getItems()[0].getAlbum().getName(), response.getBody().getTracks().getItems()[0].getExternal_urls().getSpotify());
		return new ResponseEntity<>(music,HttpStatus.OK); 
	}

	@PostMapping("/savetrack")
	public ResponseEntity<Music> saveSong(@RequestBody Music music) {
		return (musicService.saveTrack(music)) ?
					new ResponseEntity<>(music, HttpStatus.OK) :
					new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	
	

}
