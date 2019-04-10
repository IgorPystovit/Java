package com.epam.hypermarket;

import java.util.*;

public class RecommendationList {
    private static Scanner scan = new Scanner(System.in);
    private static List<Tunable> recommendedProductsList ;

    public static Selectable woodenFurniture = new Selectable() {
        @Override
        public List<Tunable> formRecommendationList(Tunable articleType) {
            List<Tunable> productsList = new LinkedList<Tunable>(articleType.getProducts());
            recommendedProductsList = new ArrayList<>();
            Double customCost = 0.0;
            Material customMaterial = Material.UNDEFINED;
            Shape customShape = Shape.UNDEFINED;

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
                customShape = Shape.UNDEFINED;
            }

            System.out.println("\nSet the material of product (Press Enter to ignore)");
            try{
                customMaterial = Material.valueOf(scan.nextLine().toUpperCase());
            }catch (Exception e){
                customMaterial = Material.UNDEFINED;
            }

            for (Tunable iTempArticle : productsList){
                if (customCost == 0.0){
                    if ((iTempArticle.getMaterial().equals(customMaterial)) && (iTempArticle.getShape().equals(customShape))){
                        recommendedProductsList.add(iTempArticle);
                    }
                }
                if (customMaterial.equals(Material.UNDEFINED)){
                    if ((iTempArticle.getShape().equals(customShape)) && (iTempArticle.getCost() <= customCost)){
                        recommendedProductsList.add(iTempArticle);
                    }
                }
                if (customShape.equals(Shape.UNDEFINED)){
                    if ((iTempArticle.getMaterial().equals(customMaterial)) && (iTempArticle.getCost() <= customCost)){
                        recommendedProductsList.add(iTempArticle);
                    }
                }
            }
            return recommendedProductsList;
        }
    };

    public static Selectable sanitaryEngineering = new Selectable() {
        @Override
        public List<Tunable> formRecommendationList(Tunable articleType) {
            recommendedProductsList = new ArrayList<>();
            Iterator<Tunable> it = articleType.getProducts().iterator();
            Colors customColor = Colors.UNDEFINED;
            Double customCost = 0.0;

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
                customColor = Colors.UNDEFINED;
            }

            if ((customCost == 0) && ((customColor == Colors.UNDEFINED))){
                recommendedProductsList.addAll(articleType.getProducts());
            }else{
                while (it.hasNext()){
                    Tunable tempItem = it.next();
                    if (customCost == 0){
                        if (tempItem.getColor().equals(customColor)){
                            recommendedProductsList.add(tempItem);
                        }
                    }else if (customColor == Colors.UNDEFINED){
                        if (tempItem.getCost() <= customCost){
                            recommendedProductsList.add(tempItem);
                        }
                    }else{
                        if ((tempItem.getCost() <= customCost) && (tempItem.getColor().equals(customColor))){
                            recommendedProductsList.add(tempItem);
                        }
                    }
                }
            }

            return recommendedProductsList;
        }
    };

    public static List<Tunable> getRecommendationList(Selectable productType, Tunable articleType){
        return productType.formRecommendationList(articleType);
    }
}
