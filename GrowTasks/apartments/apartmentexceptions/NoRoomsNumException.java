package com.epam.apartments.apartmentexceptions;

public class NoRoomsNumException extends Exception{
    public NoRoomsNumException(){}
    public NoRoomsNumException(String msg){
        super(msg);
    }
}
