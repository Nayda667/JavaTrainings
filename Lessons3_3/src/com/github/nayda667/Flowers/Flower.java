package com.github.nayda667.Flowers;

public class Flower {
    private String color;
    private int length;
    private int price;
private String name;
    public Flower(String color, int length, int price,String name) {
        this.color = color;
        this.length = length;
        this.price = price;
        this.name=name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
