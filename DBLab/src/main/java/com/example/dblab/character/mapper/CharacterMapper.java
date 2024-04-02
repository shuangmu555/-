package com.example.dblab.character.mapper;

import com.example.dblab.character.entity.Character;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CharacterMapper {

    @Select("select * from character1 order by winningrate desc")
    public List<Character> findAll();

    @Select("select * from character1 where position=#{position} order by winningrate desc")
    public List<Character> findByPosition(String position);


}
