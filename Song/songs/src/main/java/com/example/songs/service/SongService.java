package com.example.songs.service;

import com.example.songs.model.Song;
import com.example.songs.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
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
}