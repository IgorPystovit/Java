package growepam.preciousstones;

import java.util.Map;
import java.util.Scanner;

public class ListHandler implements RequestHandler {
    private static Scanner scan = new Scanner(System.in);
    private ListModifier listModifier;
    private PreciousStoneManager stoneManager = new PreciousStoneManager();

    public ListHandler(){}
    public ListHandler(ListModifier listModifier){
        this.listModifier = listModifier;
    }

    public Map<Gemstone,Double> performRequest(Map<Gemstone,Double> components){


        switch (listModifier){
            case ADD:

                addComponent(requestedGemstone,weight);

        }
    }

    private double readWeight(){
        double weight = 0.0;
        do {
            try {
                weight = Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException e){
                System.out.println("You have entered wrong weight value!Please retry!");
                continue;
            }
            break;
        }while (true);
        return weight;
    }

    private boolean addComponent((Map<Gemstone,Double> components){
        String gemstoneName = "";
        Gemstone requestedGemstone = null;
        double weight = 0.0;
        System.out.println("Please enter the name of gemstone and weight of it you would like to buy!");
        System.out.println("Name of stone:");
        gemstoneName = scan.nextLine();
        requestedGemstone = stoneManager.getGemstoneByName(gemstoneName);
        //if no gemstone with such name presented on the list
        //return incoming list without modification
        if (requestedGemstone == null){
            return components;
        }
        System.out.println("Needed weight (grams): ");
        weight = readWeight();
    }


}
