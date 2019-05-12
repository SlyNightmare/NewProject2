package com.revature.repository;

import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.model.Playlist;

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

	public List<Playlist> findAllPlaylists() {
		List<Playlist> playlists = sessionFactory.getCurrentSession().createQuery("from playlist").list();
		return playlists;
	}
	/*
	 * @Override public List<Playlist> findAllPlaylists(int accountId) { Playlist
	 * playlist = new Playlist(); Query query = (Query)
	 * sessionFactory.getCurrentSession().
	 * createQuery("FROM PLAYLIST WHERE A_ID = :accountId");
	 * query.setParameter("accountId", playlist.getAccount().getId());
	 * List<Playlist> playlists = ((org.hibernate.Query) query).list() ; return
	 * playlists; }
	 */
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
