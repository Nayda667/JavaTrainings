package com.github.nayda667.service;

public class TankAssemblyLine implements IAssemblyLine {

    @Override
    public IProduct assemblyProduct(IProduct iProduct) {
        iProduct.installFirstPart();
        iProduct.installSecondPart();
        iProduct.installThirdPart();
        return iProduct;
    }
}
