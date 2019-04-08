package com.epam.hypermarket.flooringtile;

import com.epam.hypermarket.Colors;

public class CarraraTile extends FlooringTile {
    private final int width = 10;
    private final int length = 20;
    private final Colors color = Colors.Green;
    private double cost = 1.70;

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public Colors getColor() {
        return color;
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
