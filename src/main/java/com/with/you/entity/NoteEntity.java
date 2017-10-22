package com.with.you.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * NoteEntity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteEntity {
    private int id;
    private String noteId;
    private String title;
    private String text;
    private Date time;
    private String img;
}
