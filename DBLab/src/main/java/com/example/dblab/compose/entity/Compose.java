package com.example.dblab.compose.entity;

public class Compose {
    String first_level_item1;
    String first_level_item2;
    String secondary_item;

    public String getFirst_level_item1() {
        return first_level_item1;
    }

    public void setFirst_level_item1(String first_level_item1) {
        this.first_level_item1 = first_level_item1;
    }

    public String getFirst_level_item2() {
        return first_level_item2;
    }

    public void setFirst_level_item2(String first_level_item2) {
        this.first_level_item2 = first_level_item2;
    }

    public String getSecondary_item() {
        return secondary_item;
    }

    public void setSecondary_item(String secondary_item) {
        this.secondary_item = secondary_item;
    }

    @Override
    public String toString() {
        return "Compose{" +
                "first_level_item1='" + first_level_item1 + '\'' +
                ", first_level_item2='" + first_level_item2 + '\'' +
                ", secondary_item='" + secondary_item + '\'' +
                '}';
    }
}
