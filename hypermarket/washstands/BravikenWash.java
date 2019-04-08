package com.epam.hypermarket.washstands;

import com.epam.hypermarket.Colors;

public class BravikenWash extends WashStand {
    private final int height = 75;
    private final int width = 30;
    private final int length = 30;
    private final Colors color = Colors.Red;
    private int cost = 1000;

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
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

    @Override
    public Colors getColor() {
        return color;
    }

}
