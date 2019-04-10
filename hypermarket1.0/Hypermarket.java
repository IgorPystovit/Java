package com.epam.hypermarket;

import com.epam.hypermarket.flooringtile.FlooringTile;
import com.epam.hypermarket.washstands.WashStand;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Hypermarket {
    private static Scanner scan = new Scanner(System.in);
//    private static SanitaryEngineering se = new SanitaryEngineering();
    private static WashStand washstands = new WashStand();
    private static FlooringTile flooringTile = new FlooringTile();
    public static List<Object> products = new LinkedList<>(); //!!!!!!!!!!!!!!

    public Hypermarket(){
        addProducts();
    }

    private static void addProducts(){
        products.addAll(SanitaryEngineering.sanitaryEngineeringProducts);
    }

    private void requestExecutor(String request){
        String productType = "";
        if (request.equals("Show products")){
            for (Object iTempProduct : products){
                System.out.print(iTempProduct);
            }
            return;
        }else if (request.equals("Recommendation list")) {
            do{
                System.out.println("\nChoose the product type you are interested in");
                System.out.println("Available product types:" +
                        "\n - Sanitary engineering;" +
                        "\n - Wooden furniture;\n");
                productType = scan.nextLine();
                if (productType.equals("Sanitary engineering")) {
                    SanitaryEngineering.RecommendationList();
                }else if (productType.equals("Wooden furniture")){
                    break;
                }else if (!productType.equals("Exit")){
                    System.out.println("No such product type! Please retry! \n");
                }
            }while(!productType.equals("Exit"));
        }else{
            System.out.println("No such request! Please Retry! \n");
        }
    }

    public void productSelection(){
        System.out.println("Welcome");
        String requestListener = "";
        do {
            System.out.println("\nPlease, type your request." +
                    "\n Available reuqests:" +
                    "\n - Show all products: Show products ;" +
                    "\n - Form recommendation list: Recommendation list ;" +
                    "\n - To exit current section: Exit;\n");
            requestListener = scan.nextLine();
            if (requestListener.equals("Exit")){
                break;
            }
            requestExecutor(requestListener);
        }while (true);
        }



    public static void main(String[] args) {
       Hypermarket h = new Hypermarket();
       h.productSelection();
    }

}
