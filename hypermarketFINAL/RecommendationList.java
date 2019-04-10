package com.epam.hypermarket;

import com.epam.hypermarket.recommendable.Recommendable;
import com.epam.hypermarket.selectable.Selectable;
import com.epam.hypermarket.selectable.SelectableFactory;
import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;

import java.util.*;

public class RecommendationList {
    private static Scanner scan = new Scanner(System.in);
    private static List<Selectable> recommendedProductsList ;

    public static List<Selectable> getRecommendationList(Recommendable productType, SelectableFactory factory){
        Set<Selectable> productSet = factory.getProducts();
        return productType.formRecommendationList(productSet);
    }

    public static Recommendable woodenFurniture = new Recommendable() {
        //Selection parameters
        Double customCost = 0.0;
        Material customMaterial = null;
        Shape customShape = null;

        private void setSelectionParameters(){
            System.out.println("\nPlease set parameters that we could recommend you product which suits you best");

            System.out.println("\nSet the cost of product (Press Enter to ignore)");
            try {
                customCost = Math.abs(Double.valueOf(scan.nextLine()));
            }catch (Exception e){
                customCost = 0.0;
            }

            System.out.println("\nSet the shape of product (Press Enter to ignore)");
            try{
                customShape = Shape.valueOf(scan.nextLine().toUpperCase());
            }catch (Exception e){
                customShape = null;
            }

            System.out.println("\nSet the material of product (Press Enter to ignore)");
            try{
                customMaterial = Material.valueOf(scan.nextLine().toUpperCase());
            }catch (Exception e){
                customMaterial = null;
            }
        }

        private boolean hasCustomCost(){
            return customCost != 0.0;
        }

        private boolean hasCustomMaterial(){
            return customMaterial != null;
        }

        private boolean hasCustomShape(){
            return customShape != null;
        }

        @Override
        public List<Selectable> formRecommendationList(Set<Selectable> productsSet) {
            recommendedProductsList = new ArrayList<>(productsSet);
            Iterator<Selectable> it = productsSet.iterator();
            setSelectionParameters();

            if (hasCustomCost()){
                for (Selectable iTempArticle : new ArrayList<>(recommendedProductsList)){
                    if (iTempArticle.getCost() > customCost){
                        recommendedProductsList.remove(iTempArticle);
                    }
                }
            }

            if (hasCustomMaterial()){
                for (Selectable iTempArticle : new ArrayList<>(recommendedProductsList)){
                    if (!iTempArticle.getMaterial().equals(customMaterial)){
                        recommendedProductsList.remove(iTempArticle);
                    }
                }
            }

            if (hasCustomShape()){
                for (Selectable iTempArticle : new ArrayList<>(recommendedProductsList)){
                    if (!iTempArticle.getShape().equals(customShape)){
                        recommendedProductsList.remove(iTempArticle);
                    }
                }
            }

            return recommendedProductsList;
        }
    };

    public static Recommendable sanitaryEngineering = new Recommendable() {
        //Selection parameters
        Colors customColor = null;
        Double customCost = 0.0;

        private void setSelectionParameters(){
            System.out.println("\nPlease set parameters that we could recommend you product which suits you best");
            System.out.println("\nSet the cost of product (Press Enter to ignore)");
            try {
                customCost = Math.abs(Double.valueOf(scan.nextLine()));
            }catch (Exception e){
                customCost = 0.0;
            }

            System.out.println("\nSet the color of product (Press Enter to ignore)");
            try{
                customColor = Colors.valueOf(scan.nextLine().toUpperCase());
            }catch (Exception e){
                customColor = null;
            }
        }

        private boolean hasCustomColor(){
            return customColor != null;
        }

        private boolean hasCustomCost(){
            return customCost != 0.0;
        }

        @Override
        public List<Selectable> formRecommendationList(Set<Selectable> productSet) {
            recommendedProductsList = new ArrayList<>(Collections.emptyList());
            Iterator<Selectable> it = productSet.iterator();

            setSelectionParameters();

            if (hasCustomCost()){
                for (Selectable iTempArticle : new ArrayList<>(recommendedProductsList)){
                    if (iTempArticle.getCost() > customCost){
                        recommendedProductsList.remove(iTempArticle);
                    }
                }
            }

            if (hasCustomColor()){
                for (Selectable iTempArticle : new ArrayList<>(recommendedProductsList)){
                    if (!iTempArticle.getColor().equals(customColor)){
                        recommendedProductsList.remove(iTempArticle);
                    }
                }
            }

            return recommendedProductsList;
        }
    };


}
