package com.epam.hypermarket;

import com.epam.hypermarket.menu.RequestHandler;
import com.epam.hypermarket.sanitaryengineering.SanitaryEngineering;
import com.epam.hypermarket.selectable.Selectable;
import com.epam.hypermarket.woodenfurniture.WoodenFurniture;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hypermarket {
    private static SanitaryEngineering sanitaryEngineering = new SanitaryEngineering();
    private static WoodenFurniture woodenFurniture = new WoodenFurniture();
    private RequestHandler requestHandler = new RequestHandler();
    public static Hypermarket hypermarketVisit = new Hypermarket();

    public static Set<Selectable> getHypermarketProducts(){
        Set<Selectable> hypermarketProducts = new LinkedHashSet<>();
        hypermarketProducts.addAll(sanitaryEngineering.getSanitaryEngineeringSet());
        hypermarketProducts.addAll(woodenFurniture.getWoodenFurnitureSet());
        return hypermarketProducts;
    }

    public static void printProducts(){
        for (Object product : getHypermarketProducts()){
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        hypermarketVisit.requestHandler.selectRequest();
    }

}
