package com.epam.apartments.estatemanagers;

import com.epam.apartments.Address;
import com.epam.apartments.InfrastructureObject;
import com.epam.apartments.InfrastructuresType;
import com.epam.apartments.realestatetypes.Penthouse;

public class PenthouseEstateManager {
    private Penthouse penthouse = new Penthouse.PenthouseBuilder("900000", 900.8)
            .address(new Address("Ukraine","Lviv","Gorodotska St.",179))
            .bedrooms(4)
            .floorNum(10)
            .hasTerrace(true)
            .infrastructure(new InfrastructureObject(InfrastructuresType.KINDEGARTEN,700),
                    new InfrastructureObject(InfrastructuresType.CINEMA,500))
            .build();

    private Penthouse penthouse1 = new Penthouse.PenthouseBuilder("760000",560)
            .address(new Address("Ukraine","Smila","Hetmana Derevyanka St.",9))
            .bedrooms(3)
            .floorNum(9)
            .hasTerrace(false)
            .infrastructure(new InfrastructureObject(InfrastructuresType.HYPERMARKET,400))
            .build();
}
