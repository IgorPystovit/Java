package com.epam.apartments.realestatetypes;

import com.epam.apartments.address.Address;
import com.epam.apartments.apartmentexceptions.NoApartmentAreaException;
import com.epam.apartments.apartmentexceptions.NoPriceException;
import com.epam.apartments.apartmentexceptions.NoRoomsNumException;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestate.RealEstate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mansion extends RealEstate {
    private final EstateType estateType = EstateType.MANSION;
    private Address address;
    private int numberOfFloors;
    private int bedroomsNumber;
    private int bathroomsNumber;
    private double area;
    private String price;
    private List<InfrastructureObject> infrastructureObjectList;

    public Mansion(){}
    public Mansion(MansionBuilder mansionBuilder){
        this.area = mansionBuilder.area;
        this.price = mansionBuilder.price;
        this.address = mansionBuilder.address;
        this.numberOfFloors = mansionBuilder.numberOfFloors;
        this.bedroomsNumber = mansionBuilder.bedroomsNum;
        this.bathroomsNumber = mansionBuilder.bathroomsNum;
        this.infrastructureObjectList = mansionBuilder.infrastructureObjectList;
    }

    public static class MansionBuilder{
        private Address address;
        private int numberOfFloors;
        private int bedroomsNum;
        private int bathroomsNum;
        private double area;
        private String price;
        private List<InfrastructureObject> infrastructureObjectList = new LinkedList<>();

        public MansionBuilder(){}
        public MansionBuilder(String price, double area)  {
            this.area = area;
            this.price = price;
        }

        public MansionBuilder address(Address address){
            this.address = address;
            return this;
        }

        public MansionBuilder numberOfFloors(int numberOfFloors){
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public MansionBuilder bedroomsNum(int bedroomsNum){
            this.bedroomsNum = bedroomsNum;
            return this;
        }

        public MansionBuilder bathroomsNum(int bathroomsNum){
            this.bathroomsNum = bathroomsNum;
            return this;
        }

        public MansionBuilder infrustructure(InfrastructureObject... infrastructureObjectList){
            this.infrastructureObjectList.addAll(Arrays.asList(infrastructureObjectList));
            return this;
        }

        public Mansion build(){
            Mansion mansion = new Mansion(this);
            try{
                validateMansion(mansion);
            } catch (NoPriceException e){
                e.printStackTrace();
            } catch (NoApartmentAreaException e){
                e.printStackTrace();
            } catch (NoRoomsNumException e){
                e.printStackTrace();
            }
            return mansion;
        }
        private Mansion validateMansion(Mansion mansion) throws NoApartmentAreaException,NoPriceException,NoRoomsNumException{
            if (Integer.parseInt(mansion.price) <= 0){
                throw new NoPriceException();
            }

            if (mansion.area <= 0){
                throw new NoApartmentAreaException();
            }

            if ((mansion.bathroomsNumber <= 0) || (mansion.bedroomsNumber <= 0)){
                throw new NoRoomsNumException();
            }
            return mansion;
        }
    }

    @Override
    public double getDistanceToObject(InfrastructureObjectType objectType){
        for (InfrastructureObject iTempObject : infrastructureObjectList){
            if (iTempObject.getInfrastructureObjectType().equals(objectType)){
                return iTempObject.getDistance();
            }
        }
        return 0.0;
    }

    public Address getAddress() {
        return address;
    }

    public int getBedroomsNum() {
        return bedroomsNumber;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPrice() {
        return Double.parseDouble(price);
    }

    @Override
    public List<InfrastructureObject> getInfrastructureObjectList() {
        return infrastructureObjectList;
    }

    @Override
    public EstateType getEstateType() {
        return estateType;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstCharToUpperCase(getEstateType().toString())).append("\n\n");
        sb.append("Address: ").append(address).append(";\n");
        sb.append("Mansion area: ").append(area).append(" sq feet;\n");
        sb.append("Bedrooms: ").append(bedroomsNumber).append(";\n");
        sb.append("Bathrooms: ").append(bathroomsNumber).append(";\n");
        sb.append("Number of floors: ").append(numberOfFloors).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructureObjectList.size() != 0){
            for (InfrastructureObject temp : infrastructureObjectList){
                sb.append("  Distance to ").append(temp.getInfrastructureObjectType().toString().toLowerCase()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }else{
            sb.append("  There are no infrastructure objects nearby;\n");
        }
        sb.append("Price: ").append(price).append("$;\n");
        return sb.toString();
    }
}
