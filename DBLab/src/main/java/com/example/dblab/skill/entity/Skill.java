package com.example.dblab.skill.entity;

public class Skill {
    String name;
    char key;
    int cd;
    int cost;
    String description;
    String character_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", key=" + key +
                ", cd=" + cd +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", character_name='" + character_name + '\'' +
                '}';
    }
}
