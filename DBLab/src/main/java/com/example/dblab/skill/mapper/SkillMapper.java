package com.example.dblab.skill.mapper;

import com.example.dblab.skill.entity.Skill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SkillMapper {

    @Select("select * from skill order by character_name")
    public List<Skill> findAll();


}
