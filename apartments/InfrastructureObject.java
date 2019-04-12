package com.epam.apartments;

public class InfrastructureObject {
    private double distance;
    private String infrastructureObjectName;
    private InfrastructuresType infrastructuresType;

    public InfrastructureObject(){}
    public InfrastructureObject(InfrastructuresType infrastructuresType,String infrastructureObjectName,double distance) {
        this.infrastructuresType = infrastructuresType;
        this.infrastructureObjectName = infrastructureObjectName;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public InfrastructuresType getInfrastructuresType() {
        return infrastructuresType;
    }

    public String getInfrastructureObjectName() {
        return infrastructureObjectName;
    }
}
