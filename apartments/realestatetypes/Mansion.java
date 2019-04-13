package com.epam.apartments.realestatetypes;

import com.epam.apartments.*;
import com.epam.apartments.apartmentexceptions.NoApartmentAreaException;
import com.epam.apartments.apartmentexceptions.NoPriceException;
import com.epam.apartments.apartmentexceptions.NoRoomsNumException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mansion extends RealEstate {
    private Address mansionAddress;
    private int numberOfFloors;
    private int bedroomsNum;
    private int bathroomsNumber;
    private double mansionArea;
    private String mansionPrice;
    private List<InfrastructureObject> infrastructures;
    private final EstateType estateType = EstateType.MANSION;

    public Mansion(){}
    public Mansion(MansionBuilder mansionBuilder){
        this.mansionArea = mansionBuilder.area;
        this.mansionPrice = mansionBuilder.price;
        this.mansionAddress = mansionBuilder.address;
        this.numberOfFloors = mansionBuilder.numberOfFloors;
        this.bedroomsNum = mansionBuilder.bedroomsNum;
        this.bathroomsNumber = mansionBuilder.bathroomsNum;
        this.infrastructures = mansionBuilder.infrastructureObjectList;
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
            this.bedroomsNum = bathroomsNum;
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
            if (Integer.parseInt(mansion.mansionPrice) <= 0){
                throw new NoPriceException();
            }

            if (mansion.mansionArea <= 0){
                throw new NoApartmentAreaException();
            }

            if ((mansion.bathroomsNumber <= 0) || (mansion.bedroomsNum <= 0)){
                throw new NoRoomsNumException();
            }
            return mansion;
        }
    }

    public Address getMansionAddress() {
        return mansionAddress;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public double getMansionArea() {
        return mansionArea;
    }

    public double getMansionPrice() {
        return Double.parseDouble(mansionPrice);
    }

    public List<InfrastructureObject> getInfrastructure() {
        return infrastructures;
    }

    public EstateType getEstateType() {
        return estateType;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Address: ").append(mansionAddress).append(";\n");
        sb.append("Mansion area: ").append(mansionArea).append(" sq feet;\n");
        sb.append("Bedrooms: ").append(bedroomsNum).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructures.size() != 0){
            for (InfrastructureObject temp : infrastructures){
                sb.append("  Distance to ").append(temp.getInfrastructuresType().toString().toLowerCase()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }else{
            sb.append("There are no infrastructure objects nearby\n");
        }
        sb.append("Price: ").append(mansionPrice.toString()).append("$;\n");
        return sb.toString();
    }
}
