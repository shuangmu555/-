package com.example.dblab.player.mapper;

import com.example.dblab.player.entity.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerMapper {
    @Select("select * from player")
    public List<Player> findAll();

    @Select("select * from player where club_name=#{club_name}")
    public List<Player> findByClub(String club_name);

    @Select("select distinct club_name from player")
    public List<String> findAllClub();

}
