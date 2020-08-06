package com.adrian.randombackendapp.data.services;

import com.adrian.randombackendapp.data.entities.BookEntity;
import com.adrian.randombackendapp.data.entities.SongEntity;
import com.adrian.randombackendapp.data.repos.BookRepository;
import com.adrian.randombackendapp.data.repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<SongEntity> getAll() {
        List<SongEntity> allSongs = new ArrayList<>();
        songRepository.findAll().forEach(allSongs::add);

        return allSongs;
    }
}
