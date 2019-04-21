package growepam.hypermarket.products.woodenfurniture;

import growepam.hypermarket.engine.ProductManager;
import growepam.hypermarket.tuningparameters.ProductType;
import growepam.hypermarket.engine.Reader;
import growepam.hypermarket.products.Product;
import growepam.hypermarket.tuningparameters.Material;
import growepam.hypermarket.tuningparameters.Shape;

import java.util.HashSet;
import java.util.Set;

public class Table extends Product{
    private String tableName;
    private double price;
    private Shape shapeOfTable;
    private Material material;

    public Table(){}

    public Table(String tableName, double price, Material material, Shape shapeOfTable){
        this.tableName = tableName;
        this.price = price;
        this.material = material;
        this.shapeOfTable = shapeOfTable;
    }

    public Set<Product> selector(){
        Set<Product> recommendations = ProductManager.getProductSet(ProductType.TABLE);

        System.out.println("Please enter parameters of select");
        System.out.println("Price (Press ENTER to ignore):");
        double customPrice = Reader.readDouble();
        System.out.println("Material (Press ENTER to ignore):");
        Material customMaterial = Reader.readMaterial();
        System.out.println("Shape (Press ENTER to ignore):");
        Shape customShape = Reader.readShape();

        for (Product tempProduct : new HashSet<>(recommendations)){
            Table tempTable = (Table) tempProduct;
            if ((customPrice != 0.0) && (tempTable.getPrice() > customPrice)){
                recommendations.remove(tempTable);
                continue;
            }

            if ((customMaterial != null) && (!tempTable.getMaterial().equals(customMaterial))){
                recommendations.remove(tempTable);
                continue;
            }

            if ((customShape != null) && (!tempTable.getShape().equals(customShape))){
                recommendations.remove(tempTable);
            }
        }
        return recommendations;
    }

    @Override
    public String getName() {
        return tableName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public Shape getShape() {
        return shapeOfTable;
    }

    public Material getMaterial() {
        return material;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append("Table: ").append(tableName);
        sb.append('\n').append("Shape of table: ").append(shapeOfTable.toString().toLowerCase()+";");
        sb.append('\n').append("Wood material: ").append(material.toString().toLowerCase()+";");
        sb.append('\n').append("Cost: ").append(price+"$;");
        return sb.toString();
    }
}
