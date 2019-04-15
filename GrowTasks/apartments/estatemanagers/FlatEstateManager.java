package com.epam.apartments.estatemanagers;

import com.epam.apartments.address.Address;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestatetypes.Flat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlatEstateManager {
    public List<Flat> flatEstateList = new LinkedList<>(Arrays.asList(
            new Flat.FlatBuilder("1900",430.2)
                    .address(new Address("Ukraine", "Lviv", "Hetmana Mazepy", 5))
                    .bedrooms(4)
                    .infrastructure(
                            new InfrastructureObject(InfrastructureObjectType.HYPERMARKET,900))
                    .build(),
            new Flat.FlatBuilder("290",750)
                    .address(new Address("Ukraine", "London", "Volynska St.", 25))
                    .bedrooms(2)
                    .infrastructure(
                            new InfrastructureObject(InfrastructureObjectType.SCHOOL,300),
                            new InfrastructureObject(InfrastructureObjectType.CINEMA,250))
                    .build(),
            new Flat.FlatBuilder("500",450)
                    .address(new Address("Ukraine","Lviv","Chornovola St.",35))
                    .bedrooms(4)
                    .infrastructure(
                            new InfrastructureObject(InfrastructureObjectType.THEATRE,500),
                            new InfrastructureObject(InfrastructureObjectType.HYPERMARKET,600))
                    .build(),
            new Flat.FlatBuilder("590",600)
                    .address(new Address("Ukraine","Lviv","Brullov St",8))
                    .bedrooms(3)
                    .infrastructure()
                    .build()));

}
