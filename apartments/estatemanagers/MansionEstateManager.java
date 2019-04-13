package com.epam.apartments.estatemanagers;

import com.epam.apartments.Address;
import com.epam.apartments.InfrastructureObject;
import com.epam.apartments.InfrastructuresType;
import com.epam.apartments.realestatetypes.Mansion;

public class MansionEstateManager {
    private Mansion mansion =  new Mansion.MansionBuilder("4000000",1900)
            .address(new Address("Great Britain","London","Linkoln St.",93))
            .bathroomsNum(4)
            .bedroomsNum(8)
            .numberOfFloors(3)
            .infrustructure(new InfrastructureObject(InfrastructuresType.CINEMA,750),
                    new InfrastructureObject(InfrastructuresType.SCHOOL,600),
                    new InfrastructureObject(InfrastructuresType.HYPERMARKET,100))
            .build();
    private Mansion mansion1 = new Mansion.MansionBuilder("39000000",2145.9)
            .address(new Address("Ukraine","Lviv","Hetmana Mazepy St.",29))
            .bathroomsNum(4)
            .bedroomsNum(3)
            .numberOfFloors(2)
            .infrustructure()
            .build();
}
