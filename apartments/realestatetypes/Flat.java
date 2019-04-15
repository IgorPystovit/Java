package com.epam.apartments.realestatetypes;

import com.epam.apartments.address.Address;
import com.epam.apartments.apartmentexceptions.NoApartmentAreaException;
import com.epam.apartments.apartmentexceptions.NoPriceException;
import com.epam.apartments.apartmentexceptions.NoRoomsNumException;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestate.RealEstate;

import java.util.*;

public class Flat extends RealEstate {
    private final EstateType estateType = EstateType.FLAT;
    private Address address;
    private double area;
    private int bedroomsNum;
    private String price;
    private List<InfrastructureObject> infrastructureObjectList;

    public Flat(){}
    public Flat(FlatBuilder flatBuilder){
        this.address = flatBuilder.address;
        this.area = flatBuilder.area;
        this.bedroomsNum = flatBuilder.bedroomsNum;
        this.price = flatBuilder.price;
        this.infrastructureObjectList = flatBuilder.infrastructureObjectList;
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

            if (flat.area <= 0){
                throw new NoApartmentAreaException();
            }

            if (Integer.parseInt(flat.price) <= 0){
                throw new NoPriceException();
            }
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

    @Override
    public double getArea() {
        return area;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
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
        sb.append("Flat area: ").append(area).append(" sq m;\n");
        sb.append("Bedrooms: ").append(bedroomsNum).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructureObjectList.size() != 0){
            for (InfrastructureObject temp : infrastructureObjectList){
                sb.append("  Distance to ").append(temp.getInfrastructureObjectType().toString().toLowerCase()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }else{
            sb.append("  There are no infrustructure objects nearby;\n");
        }
        sb.append("Rent price: ").append(price).append("$ pw;\n");
        return sb.toString();
    }
}
