package com.example.songs.repository;


import com.example.songs.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    // No need to add any methods, JpaRepository provides basic CRUD operations
}
