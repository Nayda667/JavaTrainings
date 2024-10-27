package com.github.nayda667.service;

import com.github.nayda667.model.TankTower;

public class TankTowerLineStep implements ILineStep{

    @Override
    public IProductPart buildProductPart() {
        return new TankTower();
    }
}
