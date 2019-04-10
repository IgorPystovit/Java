package com.epam.hypermarket;

import com.epam.hypermarket.flooringtile.FlooringTile;
import com.epam.hypermarket.washstands.WashStand;
import java.util.*;

public abstract class SanitaryEngineering<T extends SanitaryEngineering> {
    public static Set<SanitaryEngineering> sanitaryEngineeringProducts = set();
    private static Scanner scan = new Scanner(System.in);
    private static WashStand washStand = new WashStand();
    private static FlooringTile flooringTile = new FlooringTile();


    private static Set<SanitaryEngineering> set(){
        Set<SanitaryEngineering> sanProd = new HashSet<>();
        sanProd.addAll(WashStand.set());
        sanProd.addAll(FlooringTile.set());
        return sanProd;
    }

    public static void RecommendationList(){
        String productItem = "";
        do{
            System.out.println("\nProduct Items:" +
                    "\n - Wash-stands;"+
                    "\n - Flooring tiles; \n");
            productItem = scan.nextLine();
            if (productItem.equals("Wash-stands")){
                washStand.formRecommendationList();
            }else if (productItem.equals("Flooring tiles")){
                flooringTile.formRecommendationList();
            }else if (!productItem.equals("Exit")){
                System.out.println("No such product item");
            }
        }while (!productItem.equals("Exit"));

    }
    public abstract void formRecommendationList();

    public static void main(String[] args) {

    }
//    public <T> List<T> productSelector(Iterator<T> productIterator){
//        while (productIterator.hasNext()){
//            T tempWashstand = it.next();
//            if (customCost == 0){
//                if (customColor == Colors.DEFAULT){
//                    continue;
//                }
//                if (tempWashstand.getColor().equals(customColor)){
//                    recommendedProducts.add(tempWashstand);
//                }
//            }else if (customColor == Colors.DEFAULT){
//                if (tempWashstand.getCost() <= customCost){
//                    recommendedProducts.add(tempWashstand);
//                }
//            }else{
//                if ((tempWashstand.getCost() <= customCost) && (tempWashstand.getColor().equals(customColor))){
//                    recommendedProducts.add(tempWashstand);
//                }
//            }
//    }
}
