package com.with.you.service.impl;

import com.with.you.bean.NoteBean;
import com.with.you.bean.convert.NoteConvert;
import com.with.you.dao.NoteDao;
import com.with.you.entity.NoteEntity;
import com.with.you.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    public List<NoteBean> getNoteList() {
        return NoteConvert.toBeanList(noteDao.selectList());
    }

    public int insert(NoteBean noteBean) {

        NoteEntity noteEntity = NoteConvert.toEntity(noteBean);
        noteEntity.setTime(new Date());
        noteEntity.setImg("http://i.guancha.cn/news/2017/10/18/20171018104551519.jpg");

        return noteDao.insert(noteEntity);
    }

}
