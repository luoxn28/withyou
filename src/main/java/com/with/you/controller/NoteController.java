package com.with.you.controller;

import com.with.you.bean.NoteBean;
import com.with.you.util.WebUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 记事
 */
@RestController
@RequestMapping("/note")
public class NoteController {

    @PostMapping
    public Object postNote(@Validated NoteBean noteBean) {
        System.out.println(noteBean);
        return WebUtil.success();
    }

}
