package com.github.nayda667.model;

public class Book {
   private String name;
   private boolean onHands=false;
    public Book(String name){
        this.name=name;
    }

    public boolean isOnHands() {
        return onHands;
    }

    public void setOnHands(boolean onHands) {
        this.onHands = onHands;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                '}';
    }
}
