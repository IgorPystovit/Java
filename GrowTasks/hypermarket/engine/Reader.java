package growepam.hypermarket.engine;

import growepam.hypermarket.tuningparameters.Color;
import growepam.hypermarket.tuningparameters.Material;
import growepam.hypermarket.tuningparameters.ProductType;
import growepam.hypermarket.tuningparameters.Shape;

import java.util.Scanner;

public class Reader {
    private static Scanner scan = new Scanner(System.in);

    private Reader(){}
    public static double readDouble(){
        double price = 0.0;
        do{
            try{
                String tempString = scan.nextLine();
                if (tempString.equals("")){
                    return price;
                }
                price = Double.parseDouble(tempString);
            } catch (NumberFormatException e){
                System.out.println("Wrong value! Please retry!");
                continue;
            }
            break;
        } while (true);
        return price;
    }

    public static ProductType readProductType(){
        ProductType productType;
        System.out.println("Available types:\n" +
                "-Washstand;\n" +
                "-Tile;\n" +
                "-Table;\n" +
                "-Bookcase;\n");
        do{
            try{
                String tempString = scan.nextLine().toUpperCase();
                if (tempString.equals("")){
                    return null;
                }
                productType = ProductType.valueOf(tempString);
            } catch (IllegalArgumentException e){
                System.out.println("You have entered wrong product type! Please retry!");
                continue;
            }
            break;
        } while (true);
        return productType;
    }

    public static Color readColor(){
        Color color;
        System.out.println("Available colors:\n" +
                "-Black;\n" +
                "-White;\n" +
                "-Green;\n" +
                "-Red;\n" +
                "-Gray;\n" +
                "-Dark;\n");
        do{
            try{
                String tempString = scan.nextLine().toUpperCase();
                if (tempString.equals("")){
                    return null;
                }
                color = Color.valueOf(tempString);
            } catch (IllegalArgumentException e){
                System.out.println("You have entered wrong color! Please retry!");
                continue;
            }
            break;
        } while (true);
        return color;
    }

    public static Shape readShape(){
        Shape shape;
        System.out.println("Available shapes:\n" +
                "-Circle;\n" +
                "-Square;\n" +
                "-Rectangle;\n" +
                "-Hexagon;\n" +
                "-Triangle;\n" +
                "-Diamond;\n");
        do{
            try{
                String tempString = scan.nextLine().toUpperCase();
                if (tempString.equals("")){
                    return null;
                }
                shape = Shape.valueOf(tempString);
            } catch (IllegalArgumentException e){
                System.out.println("You have entered wrong shape! Please retry!");
                continue;
            }
            break;
        } while (true);
        return shape;
    }

    public static Material readMaterial(){
        Material material;
        System.out.println("Available materials:\n" +
                "-Pine;\n" +
                "-Cedar;\n" +
                "-Oak;\n" +
                "-Beech;\n");
        do{
            try{
                String tempString = scan.nextLine().toUpperCase();
                if (tempString.equals("")){
                    return null;
                }
                material = Material.valueOf(tempString);
            } catch (IllegalArgumentException e){
                System.out.println("You have entered wrong material! Please retry!");
                continue;
            }
            break;
        } while (true);
        return material;
    }
}
