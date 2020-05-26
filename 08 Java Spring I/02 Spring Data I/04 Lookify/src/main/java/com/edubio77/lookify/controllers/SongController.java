package com.edubio77.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edubio77.lookify.models.Song;
import com.edubio77.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;
    
    public SongController(SongService songService) {
      this.songService = songService;
    }
    
    //pagina de inicio
    @RequestMapping("/")
    public String home() {
        return "lookifies/home.jsp";
    }
    
    //Ruta con todos las canciones
    @RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "lookifies/dashboard.jsp";
	}
    
    //crear una cancion
    @RequestMapping("/songs/new")
	public String addNew(@ModelAttribute("addNew") Song song, Model model) {
		return "lookifies/new.jsp";
	}
    
    @RequestMapping(value="/process", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("addNew") Song song, BindingResult result, Model model) {
        if (result.hasErrors()) {
    		List<Song> songs = songService.allSongs();
    		model.addAttribute("songs", songs);
            return "lookifies/new.jsp";
        }
        else {
            songService.addSong(song);
            return "redirect:/dashboard";
        }
	}
    
  
    //La ruta GET /songs/{id} debe retornar una cancion y sus detalles.
  	@RequestMapping("/songs/{id}")
  	public String show(@PathVariable("id") Long id, Model model) {
  		Song song = songService.findSong(id);
  		model.addAttribute("song", song);
  		return "lookifies/songs.jsp";
  	}
  	
    //La ruta DELETE/songs/{id} debe eliminar la cancion con ese id.
  	@RequestMapping("/delete/{id}")
  	public String delete(@PathVariable("id") Long id) {
  		songService.deleteSong(id);
  		return "redirect:/dashboard";
  	}
  	
  	//Buscar por artista
  	@RequestMapping("/search/{artista}")
	public String buscar(@PathVariable("artista") String artista, Model model) {
		List<Song> songs = songService.Buscar(artista);
		model.addAttribute("artista", artista);
		model.addAttribute("songs", songs);
		return "lookifies/search.jsp";
	}
	
	@PostMapping("/search")
	public String buscar(@RequestParam("artista") String artista) {
		return "redirect:/search/"+artista;
	}
	
	//top ten
	@RequestMapping("/search/topten")
	public String topten(Model model) {
		List<Song> songs = songService.TopTen();
		model.addAttribute("songs", songs);
		return "lookifies/topten.jsp";
	}
	
}

