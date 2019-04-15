package com.epam.hypermarket;

import com.epam.hypermarket.sanitaryengineering.FlooringTile;
import com.epam.hypermarket.sanitaryengineering.WashStand;
import com.epam.hypermarket.selectable.Selectable;
import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;
import com.epam.hypermarket.woodenfurniture.Bookcase;
import com.epam.hypermarket.woodenfurniture.Table;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProductManager  {
    public static Set<Selectable> washStandSet = new LinkedHashSet<>(Arrays.asList(
            new WashStand("Braviken Wash", new Size(75.0, 30.0, 30.0), Colors.RED, Material.CERAMICS, 1000.00),
            new WashStand("Hegaviken Wash", new Size(10.0, 20.0, 90.0), Colors.RED, Material.CERAMICS, 20.00),
            new WashStand("Hemnes Wash", new Size(70.0, 30.0, 30.0), Colors.WHITE, Material.GLASS, 50.00),
            new WashStand("Omneswick Wash", new Size(90.0, 60.0, 30.0), Colors.GREEN, Material.STONE,300.00)));

    public static Set<Selectable> flooringTileSet = new LinkedHashSet<>(Arrays.asList(
            new FlooringTile("Canvas Tile",new Size(12.0,22.0), Colors.BLACK, Shape.DIAMOND ,2.40),
            new FlooringTile("Carrara Tile",new Size(10.0,20.0),Colors.GREEN,Shape.SQUARE,1.70),
            new FlooringTile("Festival Tile",new Size(12.0,24.0),Colors.RED,Shape.HEXAGON,3.00),
            new FlooringTile("Valley Ridge Tile",new Size(15.0,30.0),Colors.WHITE,Shape.TRIANGLE,3.90)));

    public static Set<Selectable> tablesSet = new LinkedHashSet<>(Arrays.asList(
            new Table("Zinus",68.99, Material.PINE,Shape.RECTANGLE,new Size(29.0,47.5,27.0)),
            new Table("Effiel",89.99, Material.OAK,Shape.CIRCLE,new Size(35.9,40.0,new Float(17.9))),
            new Table("Nathan",59.20, Material.CEDAR,Shape.SQUARE,new Size(40.0,40.0,40.0)),
            new Table("Stanton",140.59, Material.BEECH,Shape.RECTANGLE,new Size(38.5,60.0,40.4))));

    public static Set<Selectable> bookcasesSet = new LinkedHashSet<>(Arrays.asList(
            new Bookcase("Furinno",Colors.WHITE,20.00, Material.BEECH,new Size(67.5,90.0,15.5)),
            new Bookcase("TomCare",Colors.BLACK,50.00, Material.CEDAR,new Size(80.0,50.0,40.9)),
            new Bookcase("Sauder",Colors.GRAY,150.0,Material.OAK,new Size(150.5,75.4,30.0)),
            new Bookcase("Songmics",Colors.GREEN,310.00, Material.PINE,new Size(118.0,118.0,118.0))));
}
