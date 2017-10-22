package com.with.you.service;

import com.with.you.bean.NoteBean;

import java.util.List;

public interface NoteService {

    List<NoteBean> getNoteList();

    int insert(NoteBean noteBean);

}
