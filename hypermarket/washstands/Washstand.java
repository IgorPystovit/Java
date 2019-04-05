package com.epam.hypermarket.washstands;

import com.epam.hypermarket.*;

import java.util.*;

public class Washstand {
    private static Scanner scan = new Scanner(System.in);
    private static List<Washstand> washstandsList = list();
    private final int height = 0;
    private final int width = 0;
    private final int length = 0;
    private Colors color;
    private int cost;


    public static List<Washstand> list(){
        List<Washstand> washstandsList = new ArrayList<>(Arrays.asList(new HemnesWash(),new OmneswickWash(),new BravikenWash()));
        return washstandsList;
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

    public void formRecommendationList(){
        List<Washstand> recommendedProducts = new ArrayList<>();
        Iterator<Washstand> it = list().iterator();

        Colors customColor = Colors.DEFAULT;
        int customCost = 0;

        System.out.println("Please set parameters that we could recommend you product which suits you best");
        System.out.println("Set the cost of the washstand (Press 0 to ignore)");
        customCost = Math.abs(scan.nextInt());

        System.out.println("Set the color of washstand (Press 0 to ignore)");
        String colorSelectorString = scan.next();

        if (!colorSelectorString.equals("0")){
            customColor = Colors.valueOf(colorSelectorString);
        }

        while (it.hasNext()){
            Washstand tempWashstand = it.next();
            if (customCost == 0){
                if (customColor == Colors.DEFAULT){
                    continue;
                }
                if (tempWashstand.getColor().equals(customColor)){
                    recommendedProducts.add(tempWashstand);
                }
            }else {
                if ((tempWashstand.getCost() <= customCost) || (tempWashstand.getColor().equals(customColor))){
                    recommendedProducts.add(tempWashstand);
                }
            }
        }

        System.out.println("Recommended washstands");
        for (Washstand iTemp : recommendedProducts){
            System.out.println(iTemp);
        }
    }

    public void addtoCart(String productName){
        Washstand productItem = null;
        if (productName.charAt(0) != '+'){

        }
        for (Washstand iTempWashstand : washstandsList){
            if (iTempWashstand.getClass().getSimpleName().equals(productName.substring(1))){
                productItem = iTempWashstand;
                break;
            }
        }
        if (productItem == null){
            System.out.println("Error product not found");
        }else{
            System.out.println("Added");
        }
        Hypermarket.addToCart(productItem);
    }

    public void washstandsSelection(){
        System.out.println("Type \"+ Name of a product\" if you want to add product to a cart (Press 0 to ignore)");
        System.out.println("");
//        if ()
        formRecommendationList();

        String addToCartName = scan.next();
//        for (Washstand iTemp : getWashstandsList()){
//            if (iTemp.getClass().getSimpleName().equals(addToCartName)){
//
//            }
//        }
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
