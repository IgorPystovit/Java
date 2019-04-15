package com.epam.apartments.infrastructure;

public class InfrastructureObject {
    private double distance;
    private InfrastructureObjectType infrastructureObjectType;

    public InfrastructureObject(){}
    public InfrastructureObject(InfrastructureObjectType infrastructureObjectType, double distance) {
        this.infrastructureObjectType = infrastructureObjectType;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public InfrastructureObjectType getInfrastructureObjectType() {
        return infrastructureObjectType;
    }

    public void setInfrastructureObjectType(InfrastructureObjectType infrastructureObjectType) {
        this.infrastructureObjectType = infrastructureObjectType;
    }
}
