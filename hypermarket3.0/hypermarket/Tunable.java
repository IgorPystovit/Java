package com.epam.hypermarket;

import com.epam.hypermarket.woodenfurniture.WoodenFurniture;

import java.util.Set;

public interface Tunable<T extends WoodenFurniture>{
    Set<Tunable> getProducts();
    Colors getColor();
    Shape getShape();
    Material getMaterial();
    Double getCost();
    Size getSize();
}
