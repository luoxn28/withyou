package com.with.test;

import com.with.you.dao.NoteDao;
import com.with.you.entity.NoteEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {com.with.you.Application.class})
public class DbTest {

    @Autowired
    private NoteDao noteDao;

    @Test
    public void testNote() {
        System.out.println(noteDao.selectList());

        NoteEntity entity = new NoteEntity();
        entity.setNoteId("222222");
        entity.setTitle("fasdfdsfdsf");
        entity.setText("fasdfadsf");
        entity.setTime(new Date());

        noteDao.insert(entity);
    }

}
