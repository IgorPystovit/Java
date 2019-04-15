package com.epam.apartments.engine.requestperformers.listmaker;

import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.realestate.RealEstate;
import com.epam.apartments.estatemanagers.RealEstateManager;
import com.epam.apartments.engine.requestperformers.RequestHandler;

import java.util.LinkedList;
import java.util.List;

public class RecommendationListMaker implements RequestHandler {
    private ParametersReader parametersReader = new ParametersReader();
    private RealEstateManager realEstateManager = new RealEstateManager();

    public List<RealEstate> performRequest(){
        parametersReader.parametersReader();
        List<RealEstate> recommendationList = recommendationListMaker();
        return recommendationList;
    }

    private List<RealEstate> recommendationListMaker(){
        List<RealEstate> estateList = new LinkedList<>(realEstateManager.getEstateList(parametersReader.getCustomEstateType()));
        boolean hasArea = (parametersReader.getCustomArea() != 0.0);
        boolean hasPrice = (parametersReader.getCustomPrice() != 0.0);
        boolean hasInfrastructureList = (parametersReader.getCustomInfrastructureObjectList().size() != 0);
        for (RealEstate tempEstate : new LinkedList<>(estateList)){
            if (hasArea){
                if (tempEstate.getArea() > parametersReader.getCustomArea()){
                    estateList.remove(tempEstate);
                    continue;
                }
            }

            if (hasPrice){
                if (tempEstate.getPrice() > parametersReader.getCustomPrice()){
                    estateList.remove(tempEstate);
                    continue;
                }
            }

            if (hasInfrastructureList){
                boolean hasInfrastractureObject = false;
                for (InfrastructureObject tempCustomInfrastructureObject : parametersReader.getCustomInfrastructureObjectList()){
                    double distanceToOject = tempEstate.getDistanceToObject(tempCustomInfrastructureObject.getInfrastructureObjectType());
                    if ((distanceToOject != 0.0) && (distanceToOject <= tempCustomInfrastructureObject.getDistance())){
                        hasInfrastractureObject = true;
                    }
                }
                if (!hasInfrastractureObject){
                    estateList.remove(tempEstate);
                }
            }
        }
        return estateList;
    }

}
