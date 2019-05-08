package com.revature.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.revature.model.Music;
import com.revature.service.MusicService;

@Controller("musicController")
@CrossOrigin(origins="http://localhost:4200")
public class MusicControllerAlpha implements MusicController {

	private static Logger logger = Logger.getLogger(MusicControllerAlpha.class);
	
	@Autowired
	private MusicService musicService;
	
	@Override
	public Music getTitle(Music music) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Music getAlbum(Music music) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Music getArtist(Music music) {
		// TODO Auto-generated method stub
		return null;
	}

}
