package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.ProductManager;
import com.epam.hypermarket.selectable.Factory;
import com.epam.hypermarket.selectable.Selectable;
import java.util.*;

public class SanitaryEngineering{
    public static Factory factory = new Factory() {
        @Override
        public Set<Selectable> createProducts(Selectable productType) {
            return productType.construct();
        }
    };
    public Set<Selectable> getSanitaryEngineeringSet(){
        Set<Selectable> sanitaryEngineerings = new LinkedHashSet<>();
        sanitaryEngineerings.addAll(ProductManager.washStandSet);
        sanitaryEngineerings.addAll(ProductManager.flooringTileSet);
        return sanitaryEngineerings;
    }

}
