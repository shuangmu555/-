package com.example.dblab.character.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.character.mapper.CharacterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    private CharacterMapper characterMapper;

    @GetMapping("/hello")
    public String hello(){
        return "Hello world xplxplxpl";
    }


    @GetMapping("/character/findAll")
    @CrossOrigin
    public List<Character> findAllCharacter(){
        List<Character> clist = characterMapper.findAll();
        return clist;
    }

    @PostMapping("/character/findByPosition")
    @CrossOrigin
    public List<Character> findCharacterByPosition(String position){
        List<Character> clist = characterMapper.findByPosition(position);
        return clist;
    }

}
