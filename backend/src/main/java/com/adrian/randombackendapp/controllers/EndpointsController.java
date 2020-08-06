package com.adrian.randombackendapp.controllers;

import com.adrian.randombackendapp.data.entities.BookEntity;
import com.adrian.randombackendapp.data.entities.SongEntity;
import com.adrian.randombackendapp.data.services.BookService;
import com.adrian.randombackendapp.data.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndpointsController {

    @Autowired
    private BookService bookService;
    @Autowired
    private SongService songService;

    @GetMapping("/all/books")
    public List<BookEntity> getAllBooks() {
        return bookService.getAll();
    }

    @GetMapping("/all/songs")
    public List<SongEntity> getAllSongs() {
        return songService.getAll();
    }
}
