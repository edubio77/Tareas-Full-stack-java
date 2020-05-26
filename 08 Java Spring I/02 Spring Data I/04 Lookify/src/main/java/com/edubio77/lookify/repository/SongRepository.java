package com.edubio77.lookify.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edubio77.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
	List<Song> findAll();
	//buscar por artista
	List<Song> findByArtista(String artista);
	//ordernas por orden ascendente
	List<Song> findTop10ByOrderByClasificacionAsc();
}
