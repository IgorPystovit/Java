package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.*;

import java.util.*;

public class WashStand extends SanitaryEngineering implements Tunable {
    public static Set<WashStand> washStandSet = new LinkedHashSet<>(Arrays.asList(
            new WashStand("Braviken Wash", new Size(75.0, 30.0, 30.0), Colors.RED,Material.CERAMICS, 1000.00),
            new WashStand("Hegaviken Wash", new Size(10.0, 20.0, 90.0), Colors.RED, Material.CERAMICS, 20.00),
            new WashStand("Hemnes Wash", new Size(70.0, 30.0, 30.0), Colors.WHITE, Material.GLASS, 50.00),
            new WashStand("Omneswick Wash", new Size(90.0, 60.0, 30.0), Colors.GREEN, Material.STONE,300.00)));

    private String nameOfWashStand;
    private Colors color;
    private Double cost;
    private Material material;
    private Shape shape = Shape.UNDEFINED;
    private Size size;

    public WashStand() {}

    public WashStand(String nameOfWashStand, Size size, Colors color,Material material, Double cost) {
        this.nameOfWashStand = nameOfWashStand;
        this.material = material;
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Set<WashStand> getProducts(){
        return washStandSet;
    }

    public String getNameOfWashStand() {
        return nameOfWashStand;
    }

    public Double getCost() {
        return cost;
    }

    public Colors getColor(){
        return color;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(nameOfWashStand);
        sb.append('\n').append("Size: ").append(size.getHeight()).append(" x ").append(size.getLength()).append(" x ").append(size.getWidth()+"cm;");
        sb.append('\n').append("Color: ").append(color.toString().toLowerCase()+";");
        sb.append('\n').append("Material: ").append(material.toString().toLowerCase()+";");
        sb.append('\n').append("Cost: ").append(cost + "$;");
        return sb.toString();
    }
}
