package com.epam.hypermarket;

import com.epam.hypermarket.sanitaryengineering.FlooringTile;
import com.epam.hypermarket.sanitaryengineering.WashStand;
import com.epam.hypermarket.woodenfurniture.Bookcase;
import com.epam.hypermarket.woodenfurniture.Table;

import java.util.Scanner;

public class ProductSelection {
    private static Scanner scan = new Scanner(System.in);
    private static String articleType = "";
    private static String productType = "";

    public static Tunable articleTypeSelector(){
        do{
            if (productType.equals("Sanitary engineering")){
                System.out.println("\nSanitary engineering articles:" +
                        "\n - Wash-stands;"+
                        "\n - Flooring tiles; \n");
                articleType = scan.nextLine();
                if (articleType.equals("Wash-stands")){
                    return new WashStand();
                }else if (articleType.equals("Flooring tiles")) {
                    return new FlooringTile();
                }
            }else if (productType.equals("Wooden furniture")) {
                System.out.println("\nWooden furniture articles:" +
                        "\n - Tables;"+
                        "\n - Bookcases; \n");
                articleType = scan.nextLine();
                if (articleType.equals("Tables")){
                    return new Table();
                }else if (articleType.equals("Bookcases")) {
                    return new Bookcase();
                }
            }else if (!articleType.equals("Exit")){
                System.out.println("No such article type! Please retry!\n");
                continue;
            }
        }while (!articleType.equals("Exit"));
        return null;
    }
    
    public static Selectable productTypeSelector(){
        do{
            System.out.println("\nChoose the product type you are interested in");
            System.out.println("Available product types:" +
                    "\n - Sanitary engineering;" +
                    "\n - Wooden furniture;\n");
            productType = scan.nextLine();
            if (productType.equals("Sanitary engineering")) {
                return RecommendationList.sanitaryEngineering;
            }else if (productType.equals("Wooden furniture")){
                return RecommendationList.woodenFurniture;
            }else if (!productType.equals("Exit")){
                System.out.println("No such product type! Please retry!\n");
            }
        }while(!productType.equals("Exit"));
        return null;
    }

//    private RequestHandler requestHandler = new RequestHandler();
//    public void selectProduct(){
//        requestHandler.selectRequest();
//    }
}
