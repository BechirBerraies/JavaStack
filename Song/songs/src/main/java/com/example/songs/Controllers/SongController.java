package com.example.songs.Controllers;

import com.example.songs.models.Song;
import com.example.songs.services.SongService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;





@Controller
public class SongController {
    @Autowired
    private SongService songService;

	@GetMapping("/")
	public String SecondPage(Model model) {
		return "MySecondPage";
	}

    @GetMapping("/song/add")
    public String home(Model model) {
        return "index";
    }
    @PostMapping("/song/add")
    public Song createSong(@RequestBody Song song) {

        return songService.saveOrUpdateSong(song);
    }
    
    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {

        return songService.getSongById(id);
    }


    @PutMapping("/{id}")
    public Song updateSong(@PathVariable Long id, @RequestBody Song song) {
        song.setId(id);
        return songService.saveOrUpdateSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
    }
    
}