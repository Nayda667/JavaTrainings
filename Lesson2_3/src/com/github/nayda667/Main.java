package com.github.nayda667;

import com.github.nayda667.model.Tank;
import com.github.nayda667.service.TankAssemblyLine;

public class Main {

    public static void main(String[] args) {
        TankAssemblyLine tankAssemblyLine = new TankAssemblyLine();
        tankAssemblyLine.assemblyProduct(new Tank());
    }
}
