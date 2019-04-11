package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;
import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Selectable;

import java.util.Set;

public class WashStand extends SanitaryEngineering implements Selectable {
    private String nameOfWashStand;
    private Colors color;
    private Double cost;
    private Material material;
    private Shape shape;
    private Size size;

    public WashStand() {}

    public WashStand(String nameOfWashStand, Size size, Colors color,Material material, Double cost) {
        this.nameOfWashStand = nameOfWashStand;
        this.material = material;
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Set<Selectable> construct(){
        return ProductManager.washStandSet;
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
