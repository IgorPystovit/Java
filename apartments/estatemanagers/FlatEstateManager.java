package com.epam.apartments.estatemanagers;

import com.epam.apartments.Address;
import com.epam.apartments.InfrastructureObject;
import com.epam.apartments.InfrastructuresType;
import com.epam.apartments.realestatetypes.Flat;

public class FlatEstateManager {
    private Flat flat = new Flat.FlatBuilder("1900",430.2)
            .address(new Address("Ukraine", "Lviv", "Hetmana Mazepy", 5))
            .bedrooms(4)
            .infrastructure(new InfrastructureObject(InfrastructuresType.HYPERMARKET,900))
            .build();
    private Flat flat1 = new Flat.FlatBuilder("290",750)
            .address(new Address("Great Britain", "London", "Linkoln St.", 25))
            .bedrooms(2)
            .infrastructure(new InfrastructureObject(InfrastructuresType.SCHOOL,300),
                    new InfrastructureObject(InfrastructuresType.CINEMA,250))
            .build();
}
