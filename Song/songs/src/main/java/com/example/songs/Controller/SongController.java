package com.example.songs.Controller;

import com.example.songs.model.Song;
import com.example.songs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songService.getSongById(id);
    }

    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.saveOrUpdateSong(song);
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