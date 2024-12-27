package com.github.nayda667;

import com.github.nayda667.Flowers.Flower;

public class Main1 {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(new Flower("Yellow", 3, 5, "Tulip"));
        bouquet.addFlower(new Flower("Red", 3, 5, "Rosa"));
        bouquet.addFlower(new Flower("White", 3, 5, "Daisy"));
        System.out.println(Bouquet.getPriceOfBouquet(bouquet));

    }

}
