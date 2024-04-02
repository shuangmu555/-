package com.example.dblab.club.mapper;

import com.example.dblab.club.entity.Club;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClubMapper {

    @Select("select * from club")
    public List<Club> findAll();

}
