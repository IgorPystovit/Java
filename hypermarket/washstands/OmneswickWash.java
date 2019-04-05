package com.epam.hypermarket.washstands;

import com.epam.hypermarket.Colors;
import com.epam.hypermarket.washstands.Washstand;

public class OmneswickWash extends Washstand {
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

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
