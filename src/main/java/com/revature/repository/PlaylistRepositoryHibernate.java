package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Playlist;
import com.revature.model.Tracks;

@Repository("playlistRepository")
public class PlaylistRepositoryHibernate implements PlaylistRepository {

	private static Logger logger = Logger.getLogger(PlaylistRepositoryHibernate.class);

	@Autowired
	private SessionFactory sessionFactory;

	public PlaylistRepositoryHibernate() {
		logger.trace("Inject Session Factory Bean. ");
	}

	@Override
	public int save(Playlist playlist) {
		sessionFactory.getCurrentSession().save(playlist);
		return playlist.getId();
	}

	@Override
	public Playlist findbyName(String name) {
		return (Playlist) sessionFactory.getCurrentSession().get(Playlist.class, name);
		
	}

	@Override
	public List<Playlist> findAllPlaylists(int accountId) {
		List<Playlist> playlists = sessionFactory.getCurrentSession().createQuery("FROM PLAYLIST WHERE A_ID = ?").list();
		return playlists;
	}

	@Override
	public void updatePlaylist(int id, Playlist playlist) {
		Session session = sessionFactory.getCurrentSession();
		Playlist oldPlaylist = (Playlist) session.byId(Playlist.class).load(id);
		oldPlaylist.setName(playlist.getName());
		session.flush();
	}

	@Override
	public void deletePlaylist(int id) {
		// TODO Auto-generated method stub

	}

}
