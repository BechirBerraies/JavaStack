package com.example.songs.Controller;

import com.example.songs.model.Song;
import com.example.songs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/song/add")
    public String home(Model model) {
        return "index"; // This will return the view named "index"
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