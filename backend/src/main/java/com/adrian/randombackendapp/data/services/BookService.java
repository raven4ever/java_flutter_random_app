package com.adrian.randombackendapp.data.services;

import com.adrian.randombackendapp.data.entities.BookEntity;
import com.adrian.randombackendapp.data.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> getAll() {
        List<BookEntity> allBooks = new ArrayList<>();
        bookRepository.findAll().forEach(allBooks::add);

        return allBooks;
    }
}
