package com.example.dblab.item.entity;

public class Item {
    String name;
    int price;
    String attribute;
    String special_effect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSpecial_effect() {
        return special_effect;
    }

    public void setSpecial_effect(String special_effect) {
        this.special_effect = special_effect;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                ", attribute='" + attribute + '\'' +
                ", special_effect='" + special_effect + '\'' +
                '}';
    }
}
