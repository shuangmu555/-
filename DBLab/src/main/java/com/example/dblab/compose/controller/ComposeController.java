package com.example.dblab.compose.controller;

import com.example.dblab.character.entity.Character;
import com.example.dblab.compose.entity.Compose;
import com.example.dblab.compose.mapper.ComposeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComposeController {
    @Autowired
    private ComposeMapper composeMapper;

    @PostMapping("/compose/findBySecondary")
    @CrossOrigin
    public Compose findBySecondary(String secondary_item){
        Compose compose = composeMapper.findBySecondary(secondary_item);
        return compose;
    }

}
