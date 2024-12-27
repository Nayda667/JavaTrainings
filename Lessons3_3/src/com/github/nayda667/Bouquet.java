package com.github.nayda667;

import com.github.nayda667.Flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    public static ArrayList<Flower> bouquet = new ArrayList<>();

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(ArrayList<Flower> bouquet) {
        this.bouquet = bouquet;
    }
    public static void addFlower(Flower flower){
        bouquet.add(flower);
    }
    public static Integer getPriceOfBouquet(Bouquet bouquet) {
        int result = 0;
        for (Flower flower : bouquet.getBouquet()) {
            result += flower.getPrice();
        }

        return result;
    }
}
