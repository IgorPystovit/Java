package com.epam.hypermarket.flooringtile;

import com.epam.hypermarket.Colors;

public class FestivalTile extends FlooringTile{
    private final int width = 12;
    private final int length = 24;
    private final Colors color = Colors.Red;
    private double cost = 3.00;

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
