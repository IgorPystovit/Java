package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.selectable.Selectable;

import java.util.HashSet;
import java.util.Set;

public class WoodenFurniture {
//    private Table table = new Table();
//    private Bookcase bookCase = new Bookcase();

    public Set<Selectable> getWoodenFurnitureSet(){
        Set<Selectable> woodenFurnitureSet = new HashSet<>();
        woodenFurnitureSet.addAll(Table.tableFactory.getProducts());
        woodenFurnitureSet.addAll(Bookcase.bookCaseFactory.getProducts());
        return woodenFurnitureSet;
    }




}
