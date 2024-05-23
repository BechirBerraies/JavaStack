package com.example.songs.services;

import java.util.List;
import com.example.songs.models.Song;
import com.example.songs.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
    public Song createSong(Song s) {
        return songRepository.save(s);
    }

    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public Song saveOrUpdateSong(Song song) {
        return songRepository.save(song);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
    public Song updateSong(Song song) {
        return songRepository.save(song);
    }
}