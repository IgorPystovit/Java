package com.epam.apartments;

public class RealEstate {
    private double realEstateArea;
    private String realEstateAddress;
    private String realEstatePrice;
    private int bedroomsNum;
    private EstateType estateType;

    public double getApartmentArea() {
        return realEstateArea;
    }

    public double getRealEstatePrice(){
        return Double.parseDouble(realEstatePrice);
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public String getrealEstateAddress() {
        return realEstateAddress;
    }

    public EstateType getEstateType() {
        return estateType;
    }
}
