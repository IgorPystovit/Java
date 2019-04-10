package com.epam.hypermarket.flooringtile;

import com.epam.hypermarket.Colors;

public class ValleyRidgeTile extends FlooringTile{
    private final int width = 15;
    private final int length = 30;
    private final Colors color = Colors.White;
    private double cost = 3.90;

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
