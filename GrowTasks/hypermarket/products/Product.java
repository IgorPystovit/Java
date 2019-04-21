package growepam.hypermarket.products;

import growepam.hypermarket.tuningparameters.ProductType;

import java.util.Set;

public abstract class Product {
    private String name;
    private double price;
    private ProductType productType;

    public abstract Set<Product> selector();

    public ProductType getProductType() {
        return productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
