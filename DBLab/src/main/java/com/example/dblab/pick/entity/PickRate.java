package com.example.dblab.pick.entity;

public class PickRate {
    String character_name;
    int game_count;

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public int getGame_count() {
        return game_count;
    }

    public void setGame_count(int game_count) {
        this.game_count = game_count;
    }

    @Override
    public String toString() {
        return "PickRate{" +
                "character_name='" + character_name + '\'' +
                ", game_count=" + game_count +
                '}';
    }
}
