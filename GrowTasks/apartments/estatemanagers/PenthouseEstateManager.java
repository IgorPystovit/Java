package com.epam.apartments.estatemanagers;

import com.epam.apartments.address.Address;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestatetypes.Penthouse;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PenthouseEstateManager {
    public List<Penthouse> penthouseEstateList = new LinkedList<>(Arrays.asList((
            new Penthouse.PenthouseBuilder("900000", 900.8)
                    .address(new Address("Ukraine","Lviv","Horodotska St.",179))
                    .bedrooms(4)
                    .floorNum(10)
                    .hasTerrace(true)
                    .infrastructure(new InfrastructureObject(InfrastructureObjectType.KINDERGARTEN,700),
                            new InfrastructureObject(InfrastructureObjectType.CINEMA,500))
                    .build()),
            new Penthouse.PenthouseBuilder("760000",730)
                    .address(new Address("Ukraine","Lviv","Bibliotechna St.",9))
                    .bedrooms(3)
                    .floorNum(9)
                    .hasTerrace(false)
                    .infrastructure(new InfrastructureObject(InfrastructureObjectType.HYPERMARKET,400))
                    .build(),
            new Penthouse.PenthouseBuilder("500000",593.2)
                    .address(new Address("Ukraine","Lviv","Bazarna St.",43))
                    .bedrooms(7)
                    .floorNum(12)
                    .hasTerrace(true)
                    .infrastructure(new InfrastructureObject(InfrastructureObjectType.SCHOOL,877),
                            new InfrastructureObject(InfrastructureObjectType.CINEMA,530),
                            new InfrastructureObject(InfrastructureObjectType.THEATRE,390))
                    .build(),
            new Penthouse.PenthouseBuilder("360000",378.6)
                    .address(new Address("Ukraine","Lviv","Botkina St.",12))
                    .bedrooms(4)
                    .floorNum(6)
                    .hasTerrace(true)
                    .infrastructure(new InfrastructureObject(InfrastructureObjectType.CINEMA,600),
                            new InfrastructureObject(InfrastructureObjectType.KINDERGARTEN,200))
                    .build()));

}
