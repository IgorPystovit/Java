package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.*;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static com.epam.hypermarket.Colors.UNDEFINED;

public class Table extends WoodenFurniture implements Tunable {
    public static Set<Table> tablesSet = new LinkedHashSet<>(Arrays.asList(
            new Table("Zinus",68.99, Material.PINE,Shape.RECTANGLE,new Size(29.0,47.5,27.0)),
            new Table("Effiel",89.99, Material.OAK,Shape.CIRCLE,new Size(35.9,40.0,new Float(17.9))),
            new Table("Nathan",59.20, Material.CEDAR,Shape.SQUARE,new Size(40.0,40.0,40.0)),
            new Table("Stanton",140.59, Material.BEECH,Shape.RECTANGLE,new Size(38.5,60.0,40.4))));
    private String tableName;
    private Double cost;
    private Shape shapeOfTable;
    private Material material;
    private Size size;
    private Colors color = UNDEFINED;

    public Table(){}

    public Table(String tableName, Double cost, Material material, Shape shapeOfTable, Size size){
        this.tableName = tableName;
        this.cost = cost;
        this.material = material;
        this.shapeOfTable = shapeOfTable;
        this.size = size;
        this.color = color;
    }

    public Set<Table> getProducts(){
        return tablesSet;
    }

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
