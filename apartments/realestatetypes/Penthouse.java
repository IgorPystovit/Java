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

public class Penthouse extends RealEstate {
    private final EstateType estateType = EstateType.PENTHOUSE;
    private int floorNum;
    private boolean hasTerrace;
    private double area;
    private int bedroomsNum;
    private String price;
    private List<InfrastructureObject> infrastructureObjectList;
    private Address address;

    public Penthouse(){}
    public Penthouse(PenthouseBuilder penthouseBuilder){
        this.area = penthouseBuilder.area;
        this.bedroomsNum = penthouseBuilder.bedroomsNum;
        this.floorNum = penthouseBuilder.floorNum;
        this.hasTerrace = penthouseBuilder.hasTerrace;
        this.price = penthouseBuilder.price;
        this.infrastructureObjectList = penthouseBuilder.infrastructureObjectList;
        this.address = penthouseBuilder.address;
    }

    public static class PenthouseBuilder{
        private double area;
        private int bedroomsNum;
        private int floorNum;
        private boolean hasTerrace;
        private String price;
        private List<InfrastructureObject> infrastructureObjectList = new LinkedList<>();
        private Address address;

        public PenthouseBuilder(){}
        public PenthouseBuilder(String price, double area){
            this.price = price;
            this.area = area;
        }

        public PenthouseBuilder floorNum(int floorNum){
            this.floorNum = floorNum;
            return this;
        }

        public PenthouseBuilder hasTerrace(boolean hasTerrace){
            this.hasTerrace = hasTerrace;
            return this;
        }

        public PenthouseBuilder address(Address address){
            this.address = address;
            return  this;
        }

        public PenthouseBuilder bedrooms(int bedroomsNum){
            this.bedroomsNum = bedroomsNum;
            return this;
        }

        public PenthouseBuilder infrastructure(InfrastructureObject... infrastructure){
            infrastructureObjectList.addAll(Arrays.asList(infrastructure));
            return this;
        }

        public Penthouse build(){
            Penthouse Penthouse = new Penthouse(this);
            try{
                validatePenthouse(Penthouse);
            } catch (NoRoomsNumException e){
                e.printStackTrace();
            } catch (NoPriceException e){
                e.printStackTrace();
            } catch (NoApartmentAreaException e){
                e.printStackTrace();
            }

            return Penthouse;
        }

        private void validatePenthouse(Penthouse penthouse) throws NoApartmentAreaException,NoPriceException,NoRoomsNumException{
            if (penthouse.bedroomsNum <= 0){
                throw new NoRoomsNumException();
            }

            if (penthouse.area <= 0){
                throw new NoApartmentAreaException();
            }

            if (Integer.parseInt(penthouse.price) <= 0){
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
    
    @Override
    public double getPrice(){
        return Double.parseDouble(price);
    }

    @Override
    public List<InfrastructureObject> getInfrastructureObjectList() {
        return infrastructureObjectList;
    }

    public Address getAddress() {
        return address;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    @Override
    public EstateType getEstateType() {
        return estateType;
    }

    public int getFloorNum() {
        return floorNum;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstCharToUpperCase(getEstateType().toString())).append("\n\n");
        sb.append("Address: ").append(address).append(";\n");
        sb.append("Penthouse area: ").append(area).append(" sq feet;\n");
        sb.append("Bedrooms: ").append(bedroomsNum).append(";\n");
        sb.append("Infrastructure: \n");
        if (infrastructureObjectList.size() != 0){
            for (InfrastructureObject temp : infrastructureObjectList){
                sb.append("  Distance to ").append(temp.getInfrastructureObjectType().toString().toLowerCase()).append(" - ").append(temp.getDistance()).append(" m;\n");
            }
        }else{
            sb.append("  There are no infrastructure objects nearby;\n");
        }
        sb.append("Floor: ").append(floorNum).append(";\n");
        sb.append("Terrase: ");
        if (hasTerrace){
            sb.append("available").append(";\n");
        }else{
            sb.append("not available").append(";\n");
        }
        sb.append("Price: ").append(price).append("$;\n");
        return sb.toString();
    }
}
