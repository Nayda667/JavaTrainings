package com.github.nayda667.model;

import com.github.nayda667.service.*;

public class Tank implements IProduct {

    private IProductPart body;
    private IProductPart engine;
    private IProductPart tankTower;

    public Tank() {
        System.out.println("create the tank");
    }

    @Override
    public void installFirstPart() {
        this.body = new BodyLineStep().buildProductPart();
        System.out.println("install body");
    }

    @Override
    public void installSecondPart() {
        this.engine = new EngineLineStep().buildProductPart();
        System.out.println("install engine");
    }

    @Override
    public void installThirdPart() {
        this.tankTower = new TankTowerLineStep().buildProductPart();
        System.out.println("install tank tower");
    }
}
