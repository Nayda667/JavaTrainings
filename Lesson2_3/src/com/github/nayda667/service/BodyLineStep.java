package com.github.nayda667.service;

import com.github.nayda667.model.Body;

public class BodyLineStep implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new Body();
    }
}
