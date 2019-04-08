package com.epam.hypermarket;

import java.util.*;

public class SanitaryEngineering<T extends SanitaryEngineering>{
    private static Scanner scan = new Scanner(System.in);
    public static WashStand washStand = new WashStand();
    public static FlooringTile flooringTile = new FlooringTile();

    private Double cost;
    private Colors color;

    public Set<SanitaryEngineering> getProducts(){
        Set<SanitaryEngineering> sanitaryEngineerings = new LinkedHashSet<>();
        sanitaryEngineerings.addAll(WashStand.washStandSet);
        sanitaryEngineerings.addAll(FlooringTile.flooringTileSet);
        return sanitaryEngineerings;
    }

    public Double getCost() {
        return cost;
    }

    public Colors getColor(){
        return color;
    }

    public static void getRecommendationList(){
        List<SanitaryEngineering> recommendationList;
        String productItem = "";
        do{
            recommendationList = new ArrayList<>();
            System.out.println("\nProduct Items:" +
                    "\n - Wash-stands;"+
                    "\n - Flooring tiles; \n");
            productItem = scan.nextLine();
            if (productItem.equals("Wash-stands")){
                recommendationList = new SanitaryEngineering<WashStand>().formRecommendationList(WashStand.washStandSet);
            }else if (productItem.equals("Flooring tiles")){
                recommendationList = new SanitaryEngineering<FlooringTile>().formRecommendationList(FlooringTile.flooringTileSet);
            }else if (!productItem.equals("Exit")){
                System.out.println("No such product item");
                continue;
            }

            if (recommendationList.size() == 0){
                System.out.println("There is no recommended products for you");
            }else{
                System.out.println("\nRecommended products");
                for (SanitaryEngineering iTemp : recommendationList){
                    System.out.println(iTemp);
                }
            }
        }while (!productItem.equals("Exit"));
    }

    private  List<SanitaryEngineering> formRecommendationList(Set<T> sanitaryEngineeringSet) {
        List<SanitaryEngineering> recommendedProducts = new ArrayList<>();
        Iterator<T> it = sanitaryEngineeringSet.iterator();
        Colors customColor = Colors.UNDEFINED;
        Double customCost = 0.0;

        System.out.println("\nPlease set parameters that we could recommend you product which suits you best");
        System.out.println("\nSet the cost of product (Press Enter to ignore)");
        try {
            customCost = Math.abs(Double.valueOf(scan.nextLine()));
        }catch (Exception e){
            customCost = 0.0;
        }

        System.out.println("\nSet the color of product (Type Enter to ignore)");
        try{
            customColor = Colors.valueOf(scan.nextLine().toUpperCase());
        }catch (Exception e){
            customColor = Colors.UNDEFINED;
        }

        if ((customCost == 0) && ((customColor == Colors.UNDEFINED))){
            recommendedProducts.addAll(sanitaryEngineeringSet);
        }else{
            while (it.hasNext()){
                SanitaryEngineering tempItem = it.next();
                if (customCost == 0){
                    if (tempItem.getColor().equals(customColor)){
                        recommendedProducts.add(tempItem);
                    }
                }else if (customColor == Colors.UNDEFINED){
                    if (tempItem.getCost() <= customCost){
                        recommendedProducts.add(tempItem);
                    }
                }else{
                    if ((tempItem.getCost() <= customCost) && (tempItem.getColor().equals(customColor))){
                        recommendedProducts.add(tempItem);
                    }
                }
            }
        }

        return recommendedProducts;
    }
}
