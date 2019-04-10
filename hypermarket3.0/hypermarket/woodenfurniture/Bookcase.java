package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.*;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bookcase extends WoodenFurniture implements Tunable {
    public static Set<Bookcase> bookcasesSet = new LinkedHashSet<>(Arrays.asList(
            new Bookcase("Furinno",Colors.WHITE,20.00, Material.BEECH,new Size(67.5,90.0,15.5)),
            new Bookcase("TomCare",Colors.BLACK,50.00, Material.CEDAR,new Size(80.0,50.0,40.9)),
            new Bookcase("Sauder",Colors.GRAY,150.0,Material.OAK,new Size(150.5,75.4,30.0)),
            new Bookcase("Songmics",Colors.GREEN,310.00, Material.PINE,new Size(118.0,118.0,118.0)))
    );
    private String bookcaseName;
    private Double cost;
    private Size size;
    private Material material;
    private Colors color;
    private Shape shape = Shape.UNDEFINED;
    public Bookcase(){}

    public Bookcase(String BookcaseName,Colors color, Double cost, Material material, Size size){
        this.bookcaseName = BookcaseName;
        this.color = color;
        this.size = size;
        this.cost = cost;
        this.material = material;
    }

    public Set<Bookcase> getProducts(){
        return bookcasesSet;
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