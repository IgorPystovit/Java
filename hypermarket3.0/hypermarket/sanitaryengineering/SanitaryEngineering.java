package com.epam.hypermarket.sanitaryengineering;

import com.epam.hypermarket.Colors;
import com.epam.hypermarket.Selectable;

import java.util.*;

public class SanitaryEngineering{
    public static WashStand washStand = new WashStand();
    public static FlooringTile flooringTile = new FlooringTile();

    public Set<SanitaryEngineering> getSanitaryEngineeringSet(){
        Set<SanitaryEngineering> sanitaryEngineerings = new LinkedHashSet<>();
        sanitaryEngineerings.addAll(WashStand.washStandSet);
        sanitaryEngineerings.addAll(FlooringTile.flooringTileSet);
        return sanitaryEngineerings;
    }

//    private Selectable recommendationList = new Selectable<T>() {
//        @Override
//        public List<SanitaryEngineering> formRecommendationList(Set<T> sanitaryEngineeringSet) {
//            List<SanitaryEngineering> recommendedProductsList = new ArrayList<>();
//            Iterator<T> it = sanitaryEngineeringSet.iterator();
//            Colors customColor = Colors.UNDEFINED;
//            Double customCost = 0.0;
//
//            System.out.println("\nPlease set parameters that we could recommend you product which suits you best");
//            System.out.println("\nSet the cost of product (Press Enter to ignore)");
//            try {
//                customCost = Math.abs(Double.valueOf(scan.nextLine()));
//            }catch (Exception e){
//                customCost = 0.0;
//            }
//
//            System.out.println("\nSet the color of product (Press Enter to ignore)");
//            try{
//                customColor = Colors.valueOf(scan.nextLine().toUpperCase());
//            }catch (Exception e){
//                customColor = Colors.UNDEFINED;
//            }
//
//            if ((customCost == 0) && ((customColor == Colors.UNDEFINED))){
//                recommendedProductsList.addAll(sanitaryEngineeringSet);
//            }else{
//                while (it.hasNext()){
//                    SanitaryEngineering tempItem = it.next();
//                    if (customCost == 0){
//                        if (tempItem.getColor().equals(customColor)){
//                            recommendedProductsList.add(tempItem);
//                        }
//                    }else if (customColor == Colors.UNDEFINED){
//                        if (tempItem.getCost() <= customCost){
//                            recommendedProductsList.add(tempItem);
//                        }
//                    }else{
//                        if ((tempItem.getCost() <= customCost) && (tempItem.getColor().equals(customColor))){
//                            recommendedProductsList.add(tempItem);
//                        }
//                    }
//                }
//            }
//
//            return recommendedProductsList;
//        }
//    };


//    public List<SanitaryEngineering> getRecommendationList(){
//        List<SanitaryEngineering> recommendations;
//        String productItem = "";
//        do{
//            recommendations = new ArrayList<>();
////            System.out.println("\nSanitary engineering Items:" +
////                    "\n - Wash-stands;"+
////                    "\n - Flooring tiles; \n");
////            productItem = scan.nextLine();
////            if (productItem.equals("Wash-stands")){
////                recommendations = new SanitaryEngineering<WashStand>().recommendationList.formRecommendationList(WashStand.washStandSet);
////            }else if (productItem.equals("Flooring tiles")){
////                recommendations = new SanitaryEngineering<FlooringTile>().recommendationList.formRecommendationList(FlooringTile.flooringTileSet);
////            }else if (!productItem.equals("Exit")){
////                System.out.println("No such product item");
////                continue;
////            }
////
////            if (recommendations.size() == 0){
////                System.out.println("There is no recommended products for you");
////            }else{
////                System.out.println("\nRecommended products");
////                for (SanitaryEngineering iTemp : recommendations){
////                    System.out.println(iTemp);
////                }
////            }
////        }while (!productItem.equals("Exit"));
//        return recommendations;
//    }
}
