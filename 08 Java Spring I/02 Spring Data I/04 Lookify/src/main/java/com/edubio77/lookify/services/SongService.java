package com.edubio77.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.edubio77.lookify.models.Song;
import com.edubio77.lookify.repository.SongRepository;



@Service
public class SongService {
	private final SongRepository songRepository;
	
	public SongService(SongRepository songRepository ) {
		this.songRepository = songRepository;
	}
	
	//devolviendo todas las canciones
	public List<Song> allSongs() {
        return songRepository.findAll();
    }
	
	//Creando una cancion.
    public Song addSong(Song s) {
    	return songRepository.save(s);
    }
    
    //Obteniendo la información de una cancion
    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }
    
    //Borrar una cancion
    public void deleteSong(Long id) {
    	songRepository.deleteById(id);
    }
    
    //Buscar por artista
    public List<Song> Buscar(String artista){
		return songRepository.findByArtista(artista);
	}
    
    //ordenar canciones por ranking
    public List<Song> TopTen(){
		return songRepository.findTop10ByOrderByClasificacionAsc();
	}
  
}
