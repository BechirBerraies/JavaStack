package com.example.songs.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.songs.models.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    // No need to add any methods, JpaRepository provides basic CRUD operations
}
