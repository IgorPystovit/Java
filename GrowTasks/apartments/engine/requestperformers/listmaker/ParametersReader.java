package com.epam.apartments.engine.requestperformers.listmaker;

import com.epam.apartments.realestatetypes.EstateType;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParametersReader {
    private double customArea;
    private String customPrice;
    private EstateType customEstateType;
    private List<InfrastructureObject> customInfrastructureObjectList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public double getCustomArea() {
        return customArea;
    }

    public EstateType getCustomEstateType() {
        return customEstateType;
    }

    public List<InfrastructureObject> getCustomInfrastructureObjectList() {
        return customInfrastructureObjectList;
    }

    public double getCustomPrice() {
        double priceValue = 0.0;
        if (customPrice.equals("")){
            return 0.0;
        }
        try{
            priceValue = Math.abs(Double.parseDouble(customPrice));
        } catch (NumberFormatException e){
            return 0.0;
        }
        return priceValue;
    }

    private void estateTypeReader(){
        do{
            try {
                System.out.println("\nPlease enter estate type you are intrested in. This field is required!!!");
                System.out.println("Available estate types:\n" +
                        " - flat;\n" +
                        " - penthouse;\n" +
                        " - mansion;\n");
                customEstateType = EstateType.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("You have entered wrong type value! Please retry!");
                continue;
            }
            break;
        }while (true);
    }

    private void priceReader(){
            System.out.println("\nPlease enter price of "+customEstateType.toString().toLowerCase()+"(Press Enter to ignore)");
            customPrice = scan.nextLine();
    }

    private void areaReader(){
        try{
            System.out.println("\nPlease enter area of "+customEstateType.toString().toLowerCase()+" (Press Enter to ignore)");
            customArea = Math.abs(Double.parseDouble(scan.nextLine()));
        } catch (NumberFormatException e){
            customArea = 0.0;
        }
    }

    private void infrastructureObjectsReader(){
        System.out.println("\nWould you like to add a description of infrastructure objects to be nearby the property?(Type Yes/No)");
        String responseListener = scan.nextLine();
        InfrastructureObjectType objectType = null;
        double distance = 0.0;
        while (responseListener.toUpperCase().equals("YES")){
            InfrastructureObject infrastructureObject = new InfrastructureObject();
            try{
                System.out.println("\nEnter type of object");
                System.out.println("Available object types:\n"+
                        " - School;\n" +
                        " - Kindergarten;\n" +
                        " - Hypermarket;\n" +
                        " - Cinema;\n" +
                        " - Theatre;\n");
                objectType = InfrastructureObjectType.valueOf(scan.nextLine().toUpperCase());
                infrastructureObject.setInfrastructureObjectType(objectType);

                System.out.println("Enter distance to object");
                distance = Double.parseDouble(scan.nextLine());
                infrastructureObject.setDistance(distance);
            } catch (Exception e){
                objectType = null;
                distance = 0.0;
            }
            customInfrastructureObjectList.add(infrastructureObject);
            System.out.println("\nWould you like to add one more?");
            responseListener = scan.nextLine();
        }
    }

    public void parametersReader(){
        estateTypeReader();
        priceReader();
        areaReader();
        infrastructureObjectsReader();
    }
}
