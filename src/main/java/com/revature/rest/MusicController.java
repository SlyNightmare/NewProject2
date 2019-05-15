package com.revature.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.revature.model.Music;

public interface MusicController {

	ResponseEntity<List<Music>> getSongs(Music music, HttpServletRequest request);

	ResponseEntity<Music> saveSong(Music music);
}
