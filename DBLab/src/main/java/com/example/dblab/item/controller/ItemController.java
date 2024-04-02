package com.example.dblab.item.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.item.entity.Item;
import com.example.dblab.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemMapper itemMapper;

    @GetMapping("/item/findAll1")
    @CrossOrigin
    public List<Item> findAllItem1(){
        List<Item> ilist = itemMapper.findAllItem1();
        return ilist;
    }

    @GetMapping("/item/findAll2")
    @CrossOrigin
    public List<Item> findAllItem2(){
        List<Item> ilist = itemMapper.findAllItem2();
        return ilist;
    }

}
