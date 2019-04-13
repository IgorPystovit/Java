package com.epam.apartments;

public class InfrastructureObject {
    private double distance;
    private InfrastructuresType infrastructuresType;

    public InfrastructureObject(){}
    public InfrastructureObject(InfrastructuresType infrastructuresType,double distance) {
        this.infrastructuresType = infrastructuresType;
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
}
