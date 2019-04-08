package com.epam.hypermarket;

import java.util.*;

public class FlooringTile extends SanitaryEngineering {
    private static Scanner scan = new Scanner(System.in);
    public static Set<FlooringTile> flooringTileSet = new LinkedHashSet<>(Arrays.asList(new FlooringTile("Canvas Tile",12,22,Colors.BLACK,2.40),
            new FlooringTile("Carrara Tile",10,20,Colors.GREEN,1.70),
            new FlooringTile("Festival Tile",12,24,Colors.RED,3.00),
            new FlooringTile("Valley Ridge Tile",15,30,Colors.WHITE,3.90)));
    private int width;
    private int length;
    private Colors color;
    private Double cost;
    private String nameOfFlooringTile;

    public FlooringTile(){}
    public FlooringTile(String nameOfFloooringTile,int width,int length,Colors color,double cost){
        this.nameOfFlooringTile = nameOfFloooringTile;
        this.width = width;
        this.length = length;
        this.color = color;
        this.cost = cost;
    }

    public void setNameOfFlooringTile(String nameOfFlooringTile) {
        this.nameOfFlooringTile = nameOfFlooringTile;
    }

    public String getNameOfFlooringTile() {
        return nameOfFlooringTile;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(this.getNameOfFlooringTile()).append('\n');
        sb.append('\n').append("Size: ").append(this.getWidth()).append("x").append(this.getLength()).append('\n');
        sb.append("Cost: ").append(this.getCost()+"$").append(" / sqft").append('\n');
        sb.append("Color: ").append(this.getColor().toString().toLowerCase()).append('\n');
        return sb.toString();
    }

}
