package com.example.dblab.pick.entity;

public class Pick {
    String game_id;
    String pick_side;
    int pick_seq;
    String character_name;

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public String getPick_side() {
        return pick_side;
    }

    public void setPick_side(String pick_side) {
        this.pick_side = pick_side;
    }

    public int getPick_seq() {
        return pick_seq;
    }

    public void setPick_seq(int pick_seq) {
        this.pick_seq = pick_seq;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    @Override
    public String toString() {
        return "Pick{" +
                "game_id='" + game_id + '\'' +
                ", pick_side='" + pick_side + '\'' +
                ", pick_seq=" + pick_seq +
                ", character_name='" + character_name + '\'' +
                '}';
    }
}
