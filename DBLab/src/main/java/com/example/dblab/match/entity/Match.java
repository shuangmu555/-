package com.example.dblab.match.entity;

public class Match {
    String game_id;
    String date;
    String host_club;
    String away_club;
    String winner;
    String c_id;

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHost_club() {
        return host_club;
    }

    public void setHost_club(String host_club) {
        this.host_club = host_club;
    }

    public String getAway_club() {
        return away_club;
    }

    public void setAway_club(String away_club) {
        this.away_club = away_club;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    @Override
    public String toString() {
        return "Match{" +
                "game_id='" + game_id + '\'' +
                ", date='" + date + '\'' +
                ", host_club='" + host_club + '\'' +
                ", away_club='" + away_club + '\'' +
                ", winner='" + winner + '\'' +
                ", c_id='" + c_id + '\'' +
                '}';
    }
}
