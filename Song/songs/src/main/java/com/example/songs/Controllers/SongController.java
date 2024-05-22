package com.example.songs.Controllers;

import com.example.songs.models.Song;
import com.example.songs.services.SongService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class SongController {
    @Autowired
    private SongService songService;

	@GetMapping("/")
	public String createSong(Model model) {
		return "CreateSong";
	}

    @GetMapping("/song/add")
    public String home(Model model) {
        return "index";
    }
    @PostMapping("/song/add")
    public String create(@RequestBody @ModelAttribute("song") Song song , BindingResult result, Model model) {
        if (result.hasErrors()){
            System.out.println(result);
            return "index";
        }
        else{
            songService.createSong(song);
            return "redirect:/";
        }
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