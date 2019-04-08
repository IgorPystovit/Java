package com.epam.hypermarket;

import java.util.Scanner;

public class RequestHandler {
    private static Scanner scan = new Scanner(System.in);

    public void requestSelector(){
        System.out.println("Welcome");
        String requestListener = "";
        do {
            System.out.println("\nPlease, type your request." +
                    "\n Available reuqests:" +
                    "\n - Show all products: Show products ;" +
                    "\n - Form recommendation list: Recommendation list ;" +
                    "\n - To exit current section: Exit ;\n");
            requestListener = scan.nextLine();
            if (requestListener.equals("Exit")){
                break;
            }
            requestExecutor(requestListener);
        }while (true);
    }

    private void requestExecutor(String request){
        String productType = "";
        if (request.equals("Show products")){
            for (Object iTempProduct : Hypermarket.getProducts()){
                System.out.print(iTempProduct);
            }
        }else if (request.equals("Recommendation list")) {
            do{
                System.out.println("\nChoose the product type you are interested in");
                System.out.println("Available product types:" +
                        "\n - Sanitary engineering;" +
                        "\n - Wooden furniture;\n");
                productType = scan.nextLine();
                if (productType.equals("Sanitary engineering")) {
                    SanitaryEngineering.getRecommendationList();
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
}
