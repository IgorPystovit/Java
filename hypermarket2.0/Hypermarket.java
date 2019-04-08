package com.epam.hypermarket;

import java.util.List;
import java.util.*;
public class Hypermarket {
    public static SanitaryEngineering sanitaryEngineering = new SanitaryEngineering();
    public ProductSelection productSelection = new ProductSelection();

    public static Set<Object> getProducts(){
        Set<Object> hypermarketProducts = new LinkedHashSet<>();
        hypermarketProducts.addAll(sanitaryEngineering.getProducts());
        return hypermarketProducts;
    }

    public static void main(String[] args) {
        Hypermarket hypermarket = new Hypermarket();
        hypermarket.productSelection.selectProduct();
    }

}
