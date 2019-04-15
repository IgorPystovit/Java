package com.epam.hypermarket.woodenfurniture;

import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Factory;
import com.epam.hypermarket.selectable.Selectable;

import java.util.HashSet;
import java.util.Set;

public class WoodenFurniture {
    public static Factory factory = new Factory() {
        @Override
        public Set<Selectable> createProducts(Selectable productType) {
            return productType.construct();
        }
    };

    public Set<Selectable> getWoodenFurnitureSet(){
        Set<Selectable> woodenFurnitureSet = new HashSet<>();
        woodenFurnitureSet.addAll(ProductManager.bookcasesSet);
        woodenFurnitureSet.addAll(ProductManager.tablesSet);
        return woodenFurnitureSet;
    }




}
