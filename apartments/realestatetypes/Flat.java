package com.epam.apartments.realestatetypes;

import com.epam.apartments.*;
import com.epam.apartments.apartmentexceptions.NoApartmentAreaException;
import com.epam.apartments.apartmentexceptions.NoPriceException;
import com.epam.apartments.apartmentexceptions.NoRoomsNumException;

import java.util.*;

public class Flat extends RealEstate {
    private Address flatAddress;
    private double flatArea;
    private int bedroomsNum;
    private String flatPrice;
    private List<InfrastructureObject> infrastructures;
    private final EstateType estateType = EstateType.FLAT;

    public Flat(){}
    public Flat(FlatBuilder flatBuilder){
        this.flatAddress = flatBuilder.address;
        this.flatArea = flatBuilder.area;
        this.bedroomsNum = flatBuilder.bedroomsNum;
        this.flatPrice = flatBuilder.price;
        this.infrastructures = flatBuilder.infrastructureObjectList;
    }

    public static class FlatBuilder{
        private Address address;
        private double area;
        private int bedroomsNum;
        private List<InfrastructureObject> infrastructureObjectList = new LinkedList<>();
        private String price;

        public FlatBuilder(){}
        public FlatBuilder(String price, double area){
            this.price = price;
            this.area = area;
        }

        public FlatBuilder address(Address address){
            this.address = address;
            return  this;
        }

        public FlatBuilder bedrooms(int bedroomsNum){
            this.bedroomsNum = bedroomsNum;
            return this;
        }

        public FlatBuilder infrastructure(InfrastructureObject... infrastructure){
            infrastructureObjectList.addAll(Arrays.asList(infrastructure));
            return this;
        }

        public Flat build(){
            Flat flat = new Flat(this);
            try{
                validateFlat(flat);
            } catch (NoRoomsNumException e){
                e.printStackTrace();
            } catch (NoPriceException e){
                e.printStackTrace();
            } catch (NoApartmentAreaException e){
                e.printStackTrace();
            }

            return flat;
        }

        private void validateFlat(Flat flat) throws NoApartmentAreaException,NoPriceException,NoRoomsNumException{
            if (flat.bedroomsNum <= 0){
                throw new NoRoomsNumException();
            }

            if (flat.flatArea <= 0){
                throw new NoApartmentAreaException();
            }

            if (Integer.parseInt(flat.flatPrice) <= 0){
                throw new NoPriceException();
            }
        }
    }

    public Address getFlatAddress() {
        return flatAddress;
    }

    public double getFlatArea() {
        return flatArea;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public double getflatPrice() {
        return Double.parseDouble(flatPrice);
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
        sb.append("Address: ").append(flatAddress).append(";\n");
        sb.append("Flat area: ").append(flatArea).append(" sq m;\n");
        sb.append("Bedrooms: ").append(bedroomsNum).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructures.size() != 0){
            for (InfrastructureObject temp : infrastructures){
                sb.append("  Distance to ").append(temp.getInfrastructuresType().toString().toLowerCase()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }else{
            sb.append("There are no infrustructure objects nearby\n");
        }
        sb.append("Rent price: ").append(flatPrice).append("$ pw;\n");
        return sb.toString();
    }
}
