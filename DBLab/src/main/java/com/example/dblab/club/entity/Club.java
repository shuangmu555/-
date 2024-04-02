package com.example.dblab.club.entity;

public class Club {
    String name;
    String link;
    String province_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", province_name='" + province_name + '\'' +
                '}';
    }
}
