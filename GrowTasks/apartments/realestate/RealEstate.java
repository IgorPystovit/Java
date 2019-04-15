package com.epam.apartments.realestate;

import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestatetypes.EstateType;

import java.util.List;

public class RealEstate {
    private double area;
    private String price;
    private EstateType estateType;
    private List<InfrastructureObject> infrastructureObjectList;

    public List<InfrastructureObject> getInfrastructureObjectList() {
        return infrastructureObjectList;
    }

    public double getPrice(){
        return Double.parseDouble(price);
    }

    public double getArea() {
        return area;
    }

    public double getDistanceToObject(InfrastructureObjectType objectType){
        for (InfrastructureObject iTempObject : infrastructureObjectList){
            if (iTempObject.getInfrastructureObjectType().equals(objectType)){
                return iTempObject.getDistance();
            }
        }
        return 0.0;
    }

    public EstateType getEstateType() {
        return estateType;
    }

    protected String firstCharToUpperCase(String string){
        string = string.toUpperCase();
        string = string.charAt(0) + string.substring(1).toLowerCase();
        return string;
    }
}
