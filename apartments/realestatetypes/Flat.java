package com.epam.apartments.realestatetypes;

import com.epam.apartments.Address;
import com.epam.apartments.InfrastructureObject;
import com.epam.apartments.InfrastructuresType;
import com.epam.apartments.RealEstate;

import java.util.*;

public class Flat extends RealEstate {
    private Address flatAddress;
    private double flatArea;
    private boolean furnishing;
    private int bedroomsNum;
    private double rentPrice;
    private List<InfrastructureObject> infrastructure;

    public Flat(){}
    public Flat(Address flatAddress, double flatArea, boolean furnishing, int bedroomsNum, double rentPrice, List<InfrastructureObject> infrustructure){
        this.flatAddress = flatAddress;
        this.flatArea = flatArea;
        this.furnishing = furnishing;
        this.bedroomsNum = bedroomsNum;
        this.rentPrice = rentPrice;
        this.infrastructure = infrustructure;

    }

    public Address getFlatAddress() {
        return flatAddress;
    }

    public double getFlatArea() {
        return flatArea;
    }

    public boolean getfurnishingState() {
        return furnishing;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public List<InfrastructureObject> getInfrastructure() {
        return infrastructure;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Address: ").append(flatAddress).append(";\n");
        sb.append("Flat area: ").append(flatArea).append(" sq m;\n");

        if (furnishing){
            sb.append("Furnishing: furnished;\n");
        }else{
            sb.append("Furnishing: not furnished;\n");
        }

        sb.append("Bedrooms: ").append(bedroomsNum).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructure.size() != 0){
            for (InfrastructureObject temp : infrastructure){
                sb.append("  Distance to ").append(temp.getInfrastructureObjectName()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }
        sb.append("Rent price: ").append(rentPrice).append("$ pw;\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Flat flat = new Flat(new Address("Ukraine", "Lviv", "Hetmana Mazepy", 5), 435.2,
                true, 3, 1400.00, new LinkedList<>(Arrays.asList(
                new InfrastructureObject(InfrastructuresType.HYPERMARKET, "Spartak hypermarket", 600.0),
                new InfrastructureObject(InfrastructuresType.SCHOOL, "School №14", 534.0))));
        Flat flat1 = new Flat(new Address("Great Britain", "London", "Linkoln St.", 25), 290,
                true, 4, 750, new LinkedList<>(Arrays.asList(
                new InfrastructureObject(InfrastructuresType.SCHOOL, "School №19", 900),
                new InfrastructureObject(InfrastructuresType.HYPERMARKET, "Victoria Gardens hypermarket", 800))));
        System.out.println(flat);
        System.out.println(flat1);
    }
}
