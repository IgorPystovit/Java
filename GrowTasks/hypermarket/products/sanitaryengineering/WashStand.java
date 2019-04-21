package growepam.hypermarket.products.sanitaryengineering;

import growepam.hypermarket.products.Product;
import growepam.hypermarket.engine.ProductManager;
import growepam.hypermarket.tuningparameters.ProductType;
import growepam.hypermarket.engine.Reader;
import growepam.hypermarket.tuningparameters.Color;

import java.util.HashSet;
import java.util.Set;

public class WashStand extends Product {
    private final ProductType productType = ProductType.WASHSTAND;
    private String nameOfWashStand;
    private Color color;
    private double washstandPrice;

    public WashStand() {}
    public WashStand(String nameOfWashStand, Color color, double washstandPrice) {
        this.nameOfWashStand = nameOfWashStand;
        this.color = color;
        this.washstandPrice = washstandPrice;
    }


    @Override
    public Set<Product> selector(){
        Set<Product> recommendations = ProductManager.getProductSet(ProductType.WASHSTAND);
        System.out.println("Please enter parameters of select");
        System.out.println("Price (Press ENTER to ignore):");
        double customPrice = Math.abs(Reader.readDouble());
        System.out.println("Color (Press ENTER to ignore):");
        Color customColor = Reader.readColor();
        for (Product product : new HashSet<>(recommendations)){
            WashStand washStand = (WashStand)product;
            if ((customPrice != 0.0) && (washStand.getPrice() > customPrice)){
                recommendations.remove(washStand);
                continue;
            }

            if ((customColor != null) && (!washStand.getColor().equals(customColor))){
                recommendations.remove(washStand);
            }
        }
        return recommendations;
    }

    @Override
    public String getName() {
        return nameOfWashStand;
    }

    @Override
    public double getPrice() {
        return washstandPrice;
    }

    @Override
    public ProductType getProductType() {
        return productType;
    }

    public Color getColor(){
        return color;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append("Washstand: ").append(nameOfWashStand);
        sb.append('\n').append("Color: ").append(color.toString().toLowerCase()+";");
        sb.append('\n').append("Price: ").append(washstandPrice + "$;");
        return sb.toString();
    }
}
