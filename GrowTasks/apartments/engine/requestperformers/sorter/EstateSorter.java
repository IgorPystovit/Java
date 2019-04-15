package com.epam.apartments.engine.requestperformers.sorter;

import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestate.RealEstate;
import com.epam.apartments.estatemanagers.RealEstateManager;
import com.epam.apartments.engine.requestperformers.RequestHandler;
import com.epam.apartments.engine.sortparameters.SortParameter;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class EstateSorter implements RequestHandler {
    private SortParameter sortParameter;
    private Scanner scan = new Scanner(System.in);
    private RealEstateManager realEstateManager = new RealEstateManager();

    public EstateSorter(){}
    public EstateSorter(SortParameter sortParameter){
        this.sortParameter = sortParameter;
    }

    public List<RealEstate> performRequest(){
        List<RealEstate> realEstateList = new LinkedList<>();
        switch (sortParameter) {
            case AREA:
                realEstateList = sortByArea(realEstateManager.getEstateList());
                break;
            case PRICE:
                realEstateList = sortByPrice(realEstateManager.getEstateList());
                break;
            case DISTANCE:
                System.out.println("Please enter type of object");
                InfrastructureObjectType objectType;
                try {
                    objectType = InfrastructureObjectType.valueOf(scan.next().toUpperCase());
                } catch (IllegalArgumentException e){
                    System.out.println("You've entered object of wrong type!!!");
                    return null;
                }
                realEstateList = sortByDistanceToObject(objectType,realEstateManager.getEstateList());
                break;
            default:
                realEstateList.clear();
        }
        return realEstateList;
    }

    private List<RealEstate> sortByDistanceToObject(InfrastructureObjectType infrastructureObjectType, List<RealEstate> realEstateList){
        for (RealEstate iTempEstate : new LinkedList<>(realEstateList)){
            if (iTempEstate.getDistanceToObject(infrastructureObjectType) == 0.0){
                realEstateList.remove(iTempEstate);
            }
        }

        RealEstate[] realEstateArray = realEstateList.toArray(new RealEstate[0]);
        for (int i = 0; i < realEstateArray.length - 1; i++){
            for (int j = 0; j < realEstateArray.length - 1; j++){
                if (realEstateArray[j].getDistanceToObject(infrastructureObjectType) > realEstateArray[j+1].getDistanceToObject(infrastructureObjectType)){
                    RealEstate tempEstate = realEstateArray[j];
                    realEstateArray[j] = realEstateArray[j+1];
                    realEstateArray[j+1] = tempEstate;
                }
            }
        }
        realEstateList.clear();
        realEstateList.addAll(Arrays.asList(realEstateArray));
        return realEstateList;
    }

    private List<RealEstate> sortByPrice(List<RealEstate> realEstateList){
        RealEstate[] realEstateArray = realEstateList.toArray(new RealEstate[0]);
        for (int i = 0; i < realEstateArray.length - 1; i++){
            for (int j = 0; j < realEstateArray.length - 1; j++){
                if (realEstateArray[j].getPrice() > realEstateArray[j+1].getPrice()){
                    RealEstate tempEstate = realEstateArray[j];
                    realEstateArray[j] = realEstateArray[j+1];
                    realEstateArray[j+1] = tempEstate;
                }
            }
        }
        realEstateList.clear();
        realEstateList.addAll(Arrays.asList(realEstateArray));
        return realEstateList;
    }

    private List<RealEstate> sortByArea(List<RealEstate> realEstateList){
        RealEstate[] realEstateArray = realEstateList.toArray(new RealEstate[0]);
        for (int i = 0; i < realEstateArray.length - 1; i++){
            for (int j = 0; j < realEstateArray.length - 1; j++){
                if (realEstateArray[j].getArea() > realEstateArray[j+1].getArea()){
                    System.out.println("true");
                    RealEstate tempEstate = realEstateArray[j];
                    realEstateArray[j] = realEstateArray[j+1];
                    realEstateArray[j+1] = tempEstate;
                }
            }
        }
        realEstateList.clear();
        realEstateList.addAll(Arrays.asList(realEstateArray));
        return realEstateList;
    }
}
