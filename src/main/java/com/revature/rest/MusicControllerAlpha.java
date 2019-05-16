package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.revature.service.MusicService;

@RestController("musicController")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="/songs", produces=MediaType.APPLICATION_JSON_VALUE)
public class MusicControllerAlpha implements MusicController {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(MusicControllerAlpha.class);
	
	
	
	@Autowired
	private MusicService musicService;

	@PostMapping("getsong/table")
	public ResponseEntity<List<Music>> getSongs(@RequestBody Music music, HttpServletRequest request) {
		//Music trackFound = musicService.getTitle(trackFound.getTrackName());
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/savetrack")
	public ResponseEntity<Music> saveSong(@RequestBody Music music) {
		return (musicService.saveTrack(music)) ?
					new ResponseEntity<>(music, HttpStatus.OK) :
					new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	
	

}
