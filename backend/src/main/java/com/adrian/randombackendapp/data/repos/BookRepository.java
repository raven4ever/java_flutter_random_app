package com.adrian.randombackendapp.data.repos;

import com.adrian.randombackendapp.data.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
