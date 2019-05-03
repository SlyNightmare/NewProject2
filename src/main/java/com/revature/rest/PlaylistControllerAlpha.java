package com.revature.rest;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.revature.ajax.ClientMessage;
import com.revature.model.Playlist;
import com.revature.service.PlaylistService;

@Controller("playlistController")
@CrossOrigin(origins = "http://localhost:4200")
public class PlaylistControllerAlpha implements PlaylistController {

	private static Logger logger = Logger.getLogger(PlaylistControllerAlpha.class);
	
	@Autowired
	private PlaylistService playlistService;
	
	@Override
	public ClientMessage registerPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Playlist findPlaylist(Playlist playlist, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
