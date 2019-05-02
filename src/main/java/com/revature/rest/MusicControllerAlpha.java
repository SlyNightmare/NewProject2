package com.revature.rest;

import static com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.ClientMessageUtil.SOMETHING_WENT_WRONG;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.Music;
import com.revature.service.MusicService;

@Controller("musicController")
@CrossOrigin(origins="http://localhost:4200")
public class MusicControllerAlpha implements MusicController {

	private static Logger logger = Logger.getLogger(MusicControllerAlpha.class);

	@Autowired
	private MusicService musicService;
	
	//GetMapping == RequestMapping(method=RequestMethod.GET)
	
	@PostMapping("/findSong")
	public @ResponseBody Music getSong(@RequestBody Music music) {
		return musicService.getSong(music.getTitle());
	}

	@PostMapping("findAlbum")
	public @ResponseBody Music getAlbum(@RequestBody Music music) {
		return musicService.getAlbum(music.getAlbum());
	}

	@PostMapping("findArtist")
	public @ResponseBody Music getArtist(@RequestBody Music music) {
		return musicService.getArtist(music.getArtist());
	}
}

