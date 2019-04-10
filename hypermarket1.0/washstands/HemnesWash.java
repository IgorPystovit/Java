package com.epam.hypermarket.washstands;

import com.epam.hypermarket.Colors;

public class HemnesWash extends WashStand {
    private final int height = 70;
    private final int width = 30;
    private final int length = 30;
    private final Colors color = Colors.White;
    private int cost = 20;

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
