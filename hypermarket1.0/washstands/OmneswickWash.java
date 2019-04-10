package com.epam.hypermarket.washstands;

import com.epam.hypermarket.Colors;

public class OmneswickWash extends WashStand {
    private final int height = 90;
    private final int width = 60;
    private final int length = 30;
    private final Colors color = Colors.Green;
    private int cost = 300;

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLength() {
        return length;
    }

}
