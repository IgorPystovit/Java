package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;
import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Selectable;

import java.util.Set;

public class Bookcase extends WoodenFurniture implements Selectable {

    private String bookcaseName;
    private Double cost;
    private Size size;
    private Material material;
    private Colors color;
    private Shape shape;
    public Bookcase(){}

    public Bookcase(String BookcaseName,Colors color, Double cost, Material material, Size size){
        this.bookcaseName = BookcaseName;
        this.color = color;
        this.size = size;
        this.cost = cost;
        this.material = material;
    }

    public Set<Selectable> construct(){
        return ProductManager.bookcasesSet;
    }

    public Colors getColor() {
        return color;
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    public Double getCost() {
        return cost;
    }

    public Material getMaterial(){
        return material;
    }

    public String getBookcaseName() {
        return bookcaseName;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(bookcaseName);
        sb.append('\n').append("Size: ").append(size.getHeight()).append(" x ").append(size.getLength()).append(" x ").append(size.getWidth()).append(" cm;");
        sb.append('\n').append("Wood material: ").append(material.toString().toLowerCase()+";");
        sb.append('\n').append("Color: ").append(color).append(";");
        sb.append('\n').append("Cost: ").append(cost+"$;");
        return sb.toString();
    }

}