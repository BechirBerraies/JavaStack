package com.example.songs.Controllers;

import com.example.songs.models.Song;
import com.example.songs.services.SongService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


@Configuration
@Controller
public class SongController {
    @Autowired
    private SongService songService;

	@GetMapping("/")
	public String createSong(@ModelAttribute("song") Song song, Model model) {
        List<Song> songs = songService.getAllSongs();
        model.addAttribute("songs", songs);
        // System.out.println(songs);
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
    
    @GetMapping("song/{id}")
    public String getSongById(@PathVariable("id") Long id, Model model) {
        Song song = songService.getSongById(id);
        model.addAttribute("song",song);
        return "ShowSong";
    }

    @GetMapping("song/{id}/edit")
    public String updatePage(@PathVariable("id") Long id,Model model)  {
        Song songtoupdate = songService.getSongById(id);
        model.addAttribute("song", songtoupdate);
        return "Edit";
    }



    @PutMapping("song/{id}/edit")
    public String updateSong(@PathVariable Long id, @RequestBody Song song , BindingResult result)  {

        if(result.hasErrors() ){
            return "Edit";
        }else {
                
            songService.updateSong(song);
            return "redirect:/";

        }
    }

    @DeleteMapping("/song/{id}/delete")
    public String deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
        return "redirect:/";
    }
    
}