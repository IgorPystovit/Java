package com.epam.hypermarket.woodenfurniture;

import java.util.HashSet;
import java.util.Set;

public class WoodenFurniture{
//    private Table table = new Table();
//    private Bookcase bookCase = new Bookcase();

    public Set<WoodenFurniture> getWoodenFurnitureSet(){
        Set<WoodenFurniture> woodenFurnitureSet = new HashSet<>();
        woodenFurnitureSet.addAll(Table.tablesSet);
        woodenFurnitureSet.addAll(Bookcase.bookcasesSet);
        return woodenFurnitureSet;
    }




}
