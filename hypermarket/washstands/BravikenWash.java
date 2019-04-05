package com.epam.hypermarket.washstands;

import com.epam.hypermarket.Colors;
import com.epam.hypermarket.washstands.Washstand;

public class BravikenWash extends Washstand {
    private final int height = 90;
    private final int width = 300;
    private final int length = 60;
    private final Colors color = Colors.Green;
    private int cost = 500;

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
