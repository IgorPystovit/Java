package com.epam.hypermarket.menu;

import com.epam.hypermarket.Hypermarket;
import com.epam.hypermarket.ProductSelection;
import com.epam.hypermarket.RecommendationList;
import com.epam.hypermarket.selectable.Selectable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RequestHandler {
    private static Scanner scan = new Scanner(System.in);

    public void selectRequest(){
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
            executeRequest(requestListener);
        }while (true);
    }

    private List<Selectable> executeRequest(String request){
        List<Selectable> recommendations = new ArrayList<>(Collections.emptyList());

        if (request.equals("Show products")){
            Hypermarket.printProducts();
        }else if (request.equals("Recommendation list")) {
            recommendations = RecommendationList.getRecommendationList(ProductSelection.productTypeSelector(),ProductSelection.articleTypeSelector());
            printRecommendations(recommendations);
        }else{
            System.out.println("No such request! Please Retry! \n");
        }
        return recommendations;
    }

    public void printRecommendations(List<Selectable> recommendations){
        if (recommendations.size() == 0){
            System.out.println("There is no recommended products for you");
        }else{
            System.out.println("\nRecommended products");
            for (Selectable iTemp : recommendations){
                System.out.println(iTemp);
            }
        }
    }
}
