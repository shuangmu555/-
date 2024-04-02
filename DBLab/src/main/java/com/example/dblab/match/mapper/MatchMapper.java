package com.example.dblab.match.mapper;

import com.example.dblab.match.entity.Match;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MatchMapper {

    @Select("select * from match1 order by date desc")
    public List<Match> findAll();


}
