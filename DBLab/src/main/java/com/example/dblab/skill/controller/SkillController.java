package com.example.dblab.skill.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.skill.entity.Skill;
import com.example.dblab.skill.mapper.SkillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {
    @Autowired
    private SkillMapper skillMapper;

    @GetMapping("/skill/findAll")
    @CrossOrigin
    public List<Skill> findAllCharacter(){
        List<Skill> slist = skillMapper.findAll();
        return slist;
    }
}
