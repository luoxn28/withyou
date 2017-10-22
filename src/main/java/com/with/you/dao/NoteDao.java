package com.with.you.dao;

import com.with.you.entity.NoteEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//@Repository
public interface NoteDao {

    List<NoteEntity> selectList();

    int insert(NoteEntity entity);

}
