package com.example.dblab.character.entity;

public class Character
{

    private String name;
    private String alias;
    private String position;
    private String introduction;
    private float winningrate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public float getWinningrate() {
        return winningrate;
    }

    public void setWinningrate(float winningrate) {
        this.winningrate = winningrate;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", position='" + position + '\'' +
                ", introduction='" + introduction + '\'' +
                ", winningrate=" + winningrate +
                '}';
    }
}
