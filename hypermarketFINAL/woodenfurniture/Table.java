package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;
import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Selectable;
import com.epam.hypermarket.selectable.SelectableFactory;

import java.util.Set;

import com.epam.hypermarket.tuningparameters.Colors;

public class Table extends WoodenFurniture implements Selectable {
    private String tableName;
    private Double cost;
    private Shape shapeOfTable;
    private Material material;
    private Size size;
    private Colors color;

    public Table(){}

    public Table(String tableName, Double cost, Material material, Shape shapeOfTable, Size size){
        this.tableName = tableName;
        this.cost = cost;
        this.material = material;
        this.shapeOfTable = shapeOfTable;
        this.size = size;
        this.color = color;
    }

    public static SelectableFactory tableFactory = new SelectableFactory() {
        @Override
        public Set<Selectable> getProducts(){
            return ProductManager.tablesSet;
        }
    };

    public Colors getColor() {
        return color;
    }

    public String getTableName() {
        return tableName;
    }

    public Double getCost() {
        return cost;
    }

    public Shape getShape() {
        return shapeOfTable;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(tableName);
        sb.append('\n').append("Shape of table: ").append(shapeOfTable+";");
        if (shapeOfTable == Shape.CIRCLE){
            sb.append('\n').append("Size: ").append(size.getHeight()).append(" x ").append(size.getLength()).append(" cm;");
            sb.append('\n').append("Radius: ").append(size.getRadius()+" cm;");
        }else{
            sb.append('\n').append("Size: ").append(size.getHeight()).append(" x ").append(size.getLength()).append(" x ").append(size.getWidth()).append(" cm;");
        }
        sb.append('\n').append("Wood material: ").append(getMaterial().toString().toLowerCase()+";");
        sb.append('\n').append("Cost: ").append(getCost()+"$;");
        return sb.toString();
    }
}
