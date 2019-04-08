package com.epam.hypermarket;

import java.util.*;

public class WashStand extends SanitaryEngineering {
    private static Scanner scan = new Scanner(System.in);
    public static Set<WashStand> washStandSet = new LinkedHashSet<>(Arrays.asList(
            new WashStand("Braviken Wash", 75, 30, 30, Colors.RED, 1000.00),
            new WashStand("Hegaviken Wash", 10, 20, 90, Colors.RED, 20.00),
            new WashStand("Hemnes Wash", 70, 30, 30, Colors.WHITE, 50.00),
            new WashStand("Omneswick Wash", 90, 60, 30, Colors.GREEN, 300.00)));
    private String nameOfWashStand;
    private int height = 0;
    private int width = 0;
    private int length = 0;
    private Colors color;
    private Double cost;

    public WashStand() {
    }

    public WashStand(String nameOfWashStand, int height, int width, int length, Colors color, Double cost) {
        this.nameOfWashStand = nameOfWashStand;
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
        this.cost = cost;
    }



    public String getNameOfWashStand() {
        return nameOfWashStand;
    }

    public void setNameOfWashStand(String nameOfWashStand) {
        this.nameOfWashStand = nameOfWashStand;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

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


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(this.getNameOfWashStand()).append('\n');
        sb.append('\n').append("Size: ").append(this.getHeight()).append("x").append(this.getWidth()).append("x").append(this.getLength()).append('\n');
        sb.append("Cost: ").append(this.getCost() + "$").append('\n');
        sb.append("Color: ").append(this.getColor().toString().toLowerCase()).append('\n');
        return sb.toString();
    }
}
