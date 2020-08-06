package com.adrian.randombackendapp.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SongEntity extends BaseEntity {

    private String songName;
    private String songArtist;
    private String songUrl;
}
