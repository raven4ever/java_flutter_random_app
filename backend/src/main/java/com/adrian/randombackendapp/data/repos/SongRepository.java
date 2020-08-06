package com.adrian.randombackendapp.data.repos;

import com.adrian.randombackendapp.data.entities.SongEntity;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<SongEntity, Long> {
}
