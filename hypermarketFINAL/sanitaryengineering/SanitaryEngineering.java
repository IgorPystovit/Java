package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.selectable.Selectable;

import java.util.*;

public class SanitaryEngineering{
    public static WashStand washStand = new WashStand();
    public static FlooringTile flooringTile = new FlooringTile();

    public Set<Selectable> getSanitaryEngineeringSet(){
        Set<Selectable> sanitaryEngineerings = new LinkedHashSet<>();
        sanitaryEngineerings.addAll(WashStand.washStandFactory.getProducts());
        sanitaryEngineerings.addAll(FlooringTile.flooringTileFactory.getProducts());
        return sanitaryEngineerings;
    }

}
