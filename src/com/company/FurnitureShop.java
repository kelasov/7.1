package com.company;

import java.util.Arrays;

public class FurnitureShop extends Furniture {
    public Sofa[] sofas;
    public Chair[] chairs;

    public FurnitureShop(Sofa[] sofas, Chair[] chairs) {
        this.sofas = sofas;
        this.chairs = chairs;
    }

    public Sofa[] getSofas() {
        return sofas;
    }

    public void setSofas(Sofa[] sofas) {
        this.sofas = sofas;
    }

    public Chair[] getChairs() {
        return chairs;
    }

    public void setChair(Chair[] chairs) {
        this.chairs = chairs;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "sofas=" + Arrays.toString(sofas) +
                ", chairs=" + Arrays.toString(chairs) +
                '}';
    }

    @Override
    public void built() {

    }
}