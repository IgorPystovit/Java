package com.epam.apartments.estatemanagers;

import com.epam.apartments.address.Address;
import com.epam.apartments.infrastructure.InfrastructureObject;
import com.epam.apartments.infrastructure.InfrastructureObjectType;
import com.epam.apartments.realestatetypes.Mansion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MansionEstateManager {
    public List<Mansion> mansionEstateList = new LinkedList<>(Arrays.asList(
            new Mansion.MansionBuilder("4000000",2400)
                    .address(new Address("Ukraine","Lviv","Washington St.",93))
                    .bathroomsNum(4)
                    .bedroomsNum(8)
                    .numberOfFloors(3)
                    .infrustructure(
                            new InfrastructureObject(InfrastructureObjectType.CINEMA,750),
                            new InfrastructureObject(InfrastructureObjectType.SCHOOL,600),
                            new InfrastructureObject(InfrastructureObjectType.HYPERMARKET,100))
                    .build(),
            new Mansion.MansionBuilder("3900000",2145.9)
                    .address(new Address("Ukraine","Lviv","Hetmana Mazepy St.",29))
                    .bathroomsNum(4)
                    .bedroomsNum(3)
                    .numberOfFloors(2)
                    .infrustructure()
                    .build(),
            new Mansion.MansionBuilder("2500000",1789.2)
                    .address(new Address("Ukraine","Lviv","Chornovola St.",25))
                    .bathroomsNum(4)
                    .bedroomsNum(8)
                    .numberOfFloors(3)
                    .infrustructure(
                            new InfrastructureObject(InfrastructureObjectType.THEATRE,500),
                            new InfrastructureObject(InfrastructureObjectType.HYPERMARKET,200),
                            new InfrastructureObject(InfrastructureObjectType.KINDERGARTEN,500))
                    .build(),
            new Mansion.MansionBuilder("3000000",1930.5)
                    .address(new Address("Ukraine","Lviv","Green St.",43))
                    .bathroomsNum(2)
                    .bedroomsNum(4)
                    .numberOfFloors(1)
                    .infrustructure(
                            new InfrastructureObject(InfrastructureObjectType.CINEMA,500))
                    .build()));
}
