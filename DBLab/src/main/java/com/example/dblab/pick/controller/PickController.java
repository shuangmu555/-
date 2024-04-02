package com.example.dblab.pick.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.pick.entity.Pick;
import com.example.dblab.pick.entity.PickRate;
import com.example.dblab.pick.mapper.PickMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PickController {
    @Autowired
    private PickMapper pickMapper;

    @PostMapping("/pick/findByGame_id")
    @CrossOrigin
    public List<Pick> findByGame_id(String game_id){
        List<Pick> plist = pickMapper.findByGame_id(game_id);
        return plist;
    }

    @GetMapping("/pick/findPickRate")
    @CrossOrigin
    public List<PickRate> findPickRate(){
        List<PickRate> plist = pickMapper.findPickRate();
        return plist;
    }

    @GetMapping("/pick/findMatchCount")
    @CrossOrigin
    public int findByGame_id(){
        return pickMapper.findMatchCount();
    }

}
