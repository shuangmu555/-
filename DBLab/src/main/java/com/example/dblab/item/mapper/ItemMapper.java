package com.example.dblab.item.mapper;

import com.example.dblab.character.entity.Character;
import com.example.dblab.item.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    @Select("select * from first_level_item order by price")
    public List<Item> findAllItem1();
    @Select("select * from secondary_item order by price")
    public List<Item> findAllItem2();
}
