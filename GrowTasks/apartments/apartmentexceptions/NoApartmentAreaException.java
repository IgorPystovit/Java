package com.epam.apartments.apartmentexceptions;

public class NoApartmentAreaException extends Exception {
    public NoApartmentAreaException(){}
    public NoApartmentAreaException(String msg){
        super(msg);
    }
}
