package com.example.dblab.match.controller;

import com.example.dblab.match.entity.Match;
import com.example.dblab.match.mapper.MatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {
    @Autowired
    private MatchMapper matchMapper;

    @GetMapping("/match/findAll")
    @CrossOrigin
    public List<Match> findAllMatch(){
        List<Match> mlist = matchMapper.findAll();
        return mlist;
    }

}
