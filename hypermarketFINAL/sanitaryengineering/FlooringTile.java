package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;
import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Selectable;
import com.epam.hypermarket.selectable.SelectableFactory;

import java.util.Set;

public class FlooringTile extends SanitaryEngineering implements Selectable {
    private Shape shape;
    private Size size;
    private Colors color;
    private Double cost;
    private Material material;
    private String nameOfFlooringTile;

    public FlooringTile(){}
    public FlooringTile(String nameOfFloooringTile,Size size,Colors color,Shape shape,Double cost){
        this.nameOfFlooringTile = nameOfFloooringTile;
        this.size = size;
        this.color = color;
        this.cost = cost;
        this.shape = shape;
    }

    public static SelectableFactory flooringTileFactory = new SelectableFactory() {
        @Override
        public Set<Selectable> getProducts(){
            return ProductManager.flooringTileSet;
        }

    };

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
