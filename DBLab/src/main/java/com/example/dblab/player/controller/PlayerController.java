package com.example.dblab.player.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.player.entity.Player;
import com.example.dblab.player.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerMapper playerMapper;


    @GetMapping("/player/findAll")
    @CrossOrigin
    public List<Player> findAllPlayer(){
        List<Player> plist = playerMapper.findAll();
        return plist;
    }

    @PostMapping("/player/findByClub")
    @CrossOrigin
    public List<Player> findPlayerByClub(String club_name){
        List<Player> plist = playerMapper.findByClub(club_name);
        return plist;
    }

    @GetMapping("/player/findAllClub")
    @CrossOrigin
    public List<String> findAllClub(){
        List<String> clist = playerMapper.findAllClub();
        return clist;
    }
}
