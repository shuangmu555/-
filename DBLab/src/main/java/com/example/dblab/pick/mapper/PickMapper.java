package com.example.dblab.pick.mapper;

import com.example.dblab.pick.entity.Pick;
import com.example.dblab.pick.entity.PickRate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PickMapper {

    //通过game_id查询一场比赛的pick记录
    @Select("select * from pick where game_id=#{game_id} order by pick_side desc , pick_seq")
    public List<Pick> findByGame_id(String game_id);

    //查找所有英雄的登场数
    @Select("select character_name, count(game_id) AS game_count from pick group by character_name order by game_count desc")
    public List<PickRate> findPickRate();

    //查找比赛数量
    @Select("select count(distinct game_id) from pick")
    public int findMatchCount();
}
