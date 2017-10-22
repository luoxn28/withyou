package com.with.you.controller;

import com.with.you.bean.NoteBean;
import com.with.you.dao.NoteDao;
import com.with.you.service.NoteService;
import com.with.you.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 记事
 */
@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    private List<NoteBean> list = new ArrayList<NoteBean>();

    @GetMapping("/list")
    public Object getNoteList() {
        return WebUtil.success(noteService.getNoteList());
    }

    @PostMapping
    public Object postNote(@Validated NoteBean noteBean) {
        return WebUtil.success(noteService.insert(noteBean));
    }

}
