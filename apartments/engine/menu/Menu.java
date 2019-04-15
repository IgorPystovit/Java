package com.epam.apartments.engine.menu;

import com.epam.apartments.realestate.RealEstate;
import com.epam.apartments.engine.requestperformers.listmaker.RecommendationListMaker;
import com.epam.apartments.engine.requestperformers.printer.EstatePrinter;
import com.epam.apartments.engine.requestperformers.sorter.EstateSorter;
import com.epam.apartments.engine.requesttypes.RequestTypes;
import com.epam.apartments.engine.sortparameters.SortParameter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scan = new Scanner(System.in);

    public List<RealEstate> requestListener(){
        String request = null;
        RequestTypes requestType = null;
        List<RealEstate> customEstateList = new LinkedList<>();
        System.out.println("Welcome to real estate customer system");
        System.out.println("Please, type your request below");
        do{
            System.out.println("Available requests:\n" +
                    " - Show all (to show all estate available);\n" +
                    " - Sort (to sort all available estate or certain type of estate by certain sort parameter);\n" +
                    " - Form recommendations (to form recommendation list based on your privileges\n" +
                    " - Exit (to exit program)");
            request = scan.nextLine();
            request = request.toUpperCase();
            if (request.equals("SHOW ALL")){
                requestType = RequestTypes.SHOW;
            }else if (request.equals("SORT")){
                requestType = RequestTypes.SORT;
            }else if (request.equals("FORM RECOMMENDATIONS")){
                requestType = RequestTypes.FORM;
            }else if (!request.equals("EXIT")){
                System.out.println("No such request! Please retry!");
                continue;
            }
            if (requestType != null){
                customEstateList = executeRequest(requestType);
                printRecommendations(customEstateList);
            }
        }while (!request.equals("EXIT"));
        return customEstateList;
    }

    private void printRecommendations(List<RealEstate> estateList){
        if (estateList.size() == 0){
            System.out.println("There are no recommendations for you");
        }else{
            for (RealEstate tempEstate : estateList){
                System.out.println(tempEstate);
            }
        }
    }

    private List<RealEstate> executeRequest(RequestTypes requestType){
        List<RealEstate> estateList = new LinkedList<>();
        switch (requestType){
            case SHOW:
                estateList = new EstatePrinter().performRequest();
                break;
            case SORT:
                System.out.println("\nPlease select sort parameter");
                System.out.println("Available sort parameters:\n" +
                        " - price;\n" +
                        " - distance (to infrastructure object);\n" +
                        " - area;\n");
                SortParameter sortParameter = SortParameter.valueOf(scan.next().toUpperCase());
                estateList = new EstateSorter(sortParameter).performRequest();
                break;
            case FORM:
                estateList = new RecommendationListMaker().performRequest();
            default:
        }
        return estateList;
    }
}
