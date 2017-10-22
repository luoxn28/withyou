package com.with.you.controller;

import com.with.you.bean.NoteBean;
import com.with.you.util.WebUtil;
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

    private List<NoteBean> list = new ArrayList<NoteBean>();

    @GetMapping("/list")
    public Object getNoteList() {
        return WebUtil.success(this.list);
    }

    @PostMapping
    public Object postNote(@Validated NoteBean noteBean) {

        noteBean.setTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        noteBean.setImg("http://i.guancha.cn/news/2017/10/18/20171018104551519.jpg");
        list.add(noteBean);
        return WebUtil.success();
    }

}
