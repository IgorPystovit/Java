package com.epam.hypermarket.washstands;

import com.epam.hypermarket.*;

import java.util.*;

public class WashStand extends SanitaryEngineering{
    private static Scanner scan = new Scanner(System.in);
    private final int height = 0;
    private final int width = 0;
    private final int length = 0;
    private final Colors color = Colors.DEFAULT;
    private int cost;
    private static Set<WashStand> washStandSet = set();

    public static Set<WashStand> set(){
        Set<WashStand> washStandsSet = new HashSet<>(Arrays.asList(new HemnesWash(),new OmneswickWash(),new BravikenWash(),new HagavikenWash()));
        return washStandsSet;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public Colors getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

            public void formRecommendationList() {
                List<WashStand> recommendedProducts = new ArrayList<>();
                Iterator<WashStand> it = WashStand.set().iterator();

                Colors customColor = Colors.DEFAULT;
                int customCost = 0;

                System.out.println("\nPlease set parameters that we could recommend you product which suits you best");
                System.out.println("\nSet the cost of the wash-stand (Press Enter to ignore)");
                try {
                    customCost = Math.abs(Integer.valueOf(scan.nextLine()));
                }catch (Exception e){
                    customCost = 0;
                }


                System.out.println("Set the color of the wahs-stand (Type Enter to ignore)");
                try{
                    customColor = Colors.valueOf(scan.nextLine());
                }catch (Exception e){
                    customColor = Colors.DEFAULT;
                }

                if ((customCost == 0) && ((customColor == Colors.DEFAULT))){
                    for (WashStand tempWahsStand : washStandSet){
                        System.out.println(tempWahsStand);
                    }
                    return;
                }
                while (it.hasNext()){
                    WashStand tempWashstand = it.next();
                    if (customCost == 0){
                        if (tempWashstand.getColor().equals(customColor)){
                            recommendedProducts.add(tempWashstand);
                        }
                    }else if (customColor == Colors.DEFAULT){
                        if (tempWashstand.getCost() <= customCost){
                            recommendedProducts.add(tempWashstand);
                        }
                    }else{
                        if ((tempWashstand.getCost() <= customCost) && (tempWashstand.getColor().equals(customColor))){
                            recommendedProducts.add(tempWashstand);
                        }
                    }
                }

                if (recommendedProducts.size() == 0){
                    System.out.println("There is no recommended wash-stands for you");
                }else{
                    System.out.println("\nRecommended wash-stands");
                    for (WashStand iTemp : recommendedProducts){
                        System.out.println(iTemp);
                    }
                }
            }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(this.getClass().getSimpleName()).append('\n');
        sb.append('\n').append("Size: ").append(this.getHeight()).append("x").append(this.getWidth()).append("x").append(this.getLength()).append('\n');
        sb.append("Cost: ").append(this.getCost()+"$").append('\n');
        sb.append("Color: ").append(this.getColor()).append('\n');
        return sb.toString();
    }



}
