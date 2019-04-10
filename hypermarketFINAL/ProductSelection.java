package com.epam.hypermarket;

import com.epam.hypermarket.sanitaryengineering.FlooringTile;
import com.epam.hypermarket.sanitaryengineering.WashStand;
import com.epam.hypermarket.recommendable.Recommendable;
import com.epam.hypermarket.selectable.SelectableFactory;
import com.epam.hypermarket.woodenfurniture.Bookcase;
import com.epam.hypermarket.woodenfurniture.Table;

import java.util.Scanner;

public class ProductSelection {
    private static Scanner scan = new Scanner(System.in);
    private static String articleType = "";
    private static String productType = "";

    public static SelectableFactory selectProductFactory(){
        SelectableFactory factory = null;
        do{
            if (productType.equals("Sanitary engineering")){
                System.out.println("\nSanitary engineering articles:" +
                        "\n - Wash-stands;"+
                        "\n - Flooring tiles; \n");
                articleType = scan.nextLine();
                if (articleType.equals("Wash-stands")){
                    factory = WashStand.washStandFactory;
                    break;
                }else if (articleType.equals("Flooring tiles")) {
                    factory = FlooringTile.flooringTileFactory;
                    break;
                }
            }else if (productType.equals("Wooden furniture")) {
                System.out.println("\nWooden furniture articles:" +
                        "\n - Tables;"+
                        "\n - Bookcases; \n");
                articleType = scan.nextLine();
                if (articleType.equals("Tables")){
                    factory = Table.tableFactory;
                    break;
                }else if (articleType.equals("Bookcases")) {
                    factory = Bookcase.bookCaseFactory;
                    break;
                }
            }else{
                System.out.println("No such article type! Please retry!\n");
            }
        }while (true);
        return factory;
    }
    
    public static Recommendable productTypeSelector(){
        Recommendable recommendableProductType = null;
        do{
            System.out.println("\nChoose the product type you are interested in");
            System.out.println("Available product types:" +
                    "\n - Sanitary engineering;" +
                    "\n - Wooden furniture;\n");
            productType = scan.nextLine();
            if (productType.equals("Sanitary engineering")) {
                recommendableProductType = RecommendationList.sanitaryEngineering;
                break;
            }else if (productType.equals("Wooden furniture")){
                recommendableProductType = RecommendationList.woodenFurniture;
                break;
            }else{
                System.out.println("No such product type! Please retry!\n");
            }
        }while(true);
        return recommendableProductType;
    }
}
