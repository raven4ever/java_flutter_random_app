package com.adrian.randombackendapp.data;

import com.adrian.randombackendapp.data.entities.BookEntity;
import com.adrian.randombackendapp.data.entities.SongEntity;
import com.adrian.randombackendapp.data.repos.BookRepository;
import com.adrian.randombackendapp.data.repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitialData {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private SongRepository songRepository;

    @PostConstruct
    public void init() {
        bookRepository.save(new BookEntity("The Count of Monte Cristo", "Alexandre Dumas", ""));
        bookRepository.save(new BookEntity("12 Rules for Life", "Jordan Peterson", ""));
        bookRepository.save(new BookEntity("On a Pale Horse", "Piers Anthony", ""));

        songRepository.save(new SongEntity("Nothing Else Matters", "Metallica", ""));
        songRepository.save(new SongEntity("Like A Stone", "Audioslave", ""));
        songRepository.save(new SongEntity("Time", "Ozzy Osbourne", ""));
    }
}
