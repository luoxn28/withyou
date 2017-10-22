package com.with.you.bean.convert;

import com.with.you.bean.NoteBean;
import com.with.you.entity.NoteEntity;
import org.dozer.DozerBeanMapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NoteConvert {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static NoteBean toBean(NoteEntity entity) {
        NoteBean bean = null;

        if (entity != null) {
            bean = mapper.map(entity, NoteBean.class);
            bean.setTime(new SimpleDateFormat("yyyy-MM-dd").format(entity.getTime()));
        }
        return bean;
    }

    public static NoteEntity toEntity(NoteBean bean) {
        return mapper.map(bean, NoteEntity.class);
    }

    public static List<NoteBean> toBeanList(List<NoteEntity> entityList) {
        List<NoteBean> list = new ArrayList<>();

        entityList.forEach(entity -> {
            list.add(toBean(entity));
        });
        return list;
    }

}
