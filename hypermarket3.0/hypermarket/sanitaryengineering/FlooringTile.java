package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.*;

import java.util.*;

public class FlooringTile extends SanitaryEngineering implements Tunable {

    public static Set<FlooringTile> flooringTileSet = new LinkedHashSet<>(Arrays.asList(
            new FlooringTile("Canvas Tile",new Size(12.0,22.0), Colors.BLACK,Shape.DIAMOND ,2.40),
            new FlooringTile("Carrara Tile",new Size(10.0,20.0),Colors.GREEN,Shape.SQUARE,1.70),
            new FlooringTile("Festival Tile",new Size(12.0,24.0),Colors.RED,Shape.HEXAGON,3.00),
            new FlooringTile("Valley Ridge Tile",new Size(15.0,30.0),Colors.WHITE,Shape.TRIANGLE,3.90)));

    private Shape shape;
    private Size size;
    private Colors color;
    private Double cost;
    private Material material = Material.UNDEFINED;
    private String nameOfFlooringTile;

    public FlooringTile(){}
    public FlooringTile(String nameOfFloooringTile,Size size,Colors color,Shape shape,Double cost){
        this.nameOfFlooringTile = nameOfFloooringTile;
        this.size = size;
        this.color = color;
        this.cost = cost;
        this.shape = shape;
    }

    public Set<FlooringTile> getProducts(){
        return flooringTileSet;
    }

    public Double getCost() {
        return cost;
    }

    public Colors getColor(){
        return color;
    }

    public String getNameOfFlooringTile() {
        return nameOfFlooringTile;
    }

    public Size getSize(){
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

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(nameOfFlooringTile);
        sb.append('\n').append("Size: ").append(size.getLength()).append("x").append(size.getWidth());
        sb.append('\n').append("Color: ").append(color.toString().toLowerCase());
        sb.append('\n').append("Shape: ").append(shape.toString().toLowerCase());
        sb.append('\n').append("Cost: ").append(cost+"$").append(" / sqft");
        return sb.toString();
    }

}
