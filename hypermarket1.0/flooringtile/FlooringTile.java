package com.epam.hypermarket.flooringtile;

import com.epam.hypermarket.Colors;
import com.epam.hypermarket.SanitaryEngineering;

import java.awt.*;
import java.util.*;
import java.util.List;

public class FlooringTile extends SanitaryEngineering {
    private static Scanner scan = new Scanner(System.in);
    private final int width = 0;
    private final int length = 0;
    private final Colors color = Colors.DEFAULT;
    private double cost;
    private static Set<FlooringTile> flooringTileSet = set();

    public static Set<FlooringTile> set(){
        Set<FlooringTile> list = new HashSet<>(Arrays.asList(new CanvasTile(),new FestivalTile(),new ValleyRidgeTile(),new CarraraTile()));
        return list;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public Colors getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void formRecommendationList() {
        List<FlooringTile> recommendedProducts = new ArrayList<>();
            Iterator<FlooringTile> it = set().iterator();
//        Object checkString = "";
        Colors customColor = Colors.DEFAULT;
        double customCost = 0;

        System.out.println("\nPlease set parameters that we could recommend you product which suits you best");
        System.out.println("\nSet the cost of the tile per square feet (Press Enter to ignore)");
        try {
            customCost = Math.abs(Double.valueOf(scan.nextLine()));
        }catch (Exception e){
            customCost = 0.0;
        }


        System.out.println("Set the color of the tile (Press Enter to ignore)");
        try{
            customColor = Colors.valueOf(scan.nextLine());
        }catch (Exception e){
            customColor = Colors.DEFAULT;
        }

        if ((customCost == 0.0) && (customColor == Colors.DEFAULT)){
            for (FlooringTile tempFlooringTile : flooringTileSet){
                System.out.println(tempFlooringTile);
            }
            return;
        }
        while (it.hasNext()) {
            FlooringTile tempTile = it.next();
            if (customCost == 0.0) {
                if (tempTile.getColor().equals(customColor)) {
                    recommendedProducts.add(tempTile);
                }
            } else if (customColor == Colors.DEFAULT) {
                if (tempTile.getCost() <= customCost) {
                    recommendedProducts.add(tempTile);
                }
            } else {
                if ((tempTile.getCost() <= customCost) && (tempTile.getColor().equals(customColor))) {
                    recommendedProducts.add(tempTile);
                }
            }
        }
        if (recommendedProducts.size() == 0){
            System.out.println("There is no recommended flooring tile for you");
        }else{
            System.out.println("Recommended flooring tile");
            for (FlooringTile iTemp : recommendedProducts){
                System.out.println(iTemp);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(this.getClass().getSimpleName()).append('\n');
        sb.append('\n').append("Size: ").append(this.getWidth()).append("x").append(this.getLength()).append('\n');
        sb.append("Cost: ").append(this.getCost()+"$").append(" / sqft").append('\n');
        sb.append("Color: ").append(this.getColor()).append('\n');
        return sb.toString();
    }

}
