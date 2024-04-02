package com.example.dblab.compose.mapper;

import com.example.dblab.character.entity.Character;
import com.example.dblab.compose.entity.Compose;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComposeMapper {

    @Select("select * from compose where secondary_item=#{secondary_item}")
    public Compose findBySecondary(String secondary_item);
}
