package com.github.nayda667.service;

import com.github.nayda667.model.Engine;

public class EngineLineStep implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new Engine();
    }
}
