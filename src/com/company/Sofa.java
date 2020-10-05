package com.company;

public class Sofa extends Furniture {
    private int price;
    private String material;

    public Sofa(int price, String material) {
        this.price = price;
        this.material = material;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String toString() {
        return "Sofa{" +
                "price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
    @Override
    public void built() {

    }
}
