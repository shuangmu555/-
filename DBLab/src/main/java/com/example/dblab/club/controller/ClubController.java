package com.example.dblab.club.controller;

import com.example.dblab.club.entity.Club;
import com.example.dblab.club.mapper.ClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClubController {
    @Autowired
    private ClubMapper clubMapper;

    @GetMapping("/club/findAll")
    @CrossOrigin
    public List<Club> findAllCharacter(){
        List<Club> clist = clubMapper.findAll();
        return clist;
    }
}
