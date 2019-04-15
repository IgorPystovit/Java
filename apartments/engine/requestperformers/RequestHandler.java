package com.epam.apartments.engine.requestperformers;

import com.epam.apartments.realestate.RealEstate;

import java.util.List;

public interface RequestHandler {
    List<RealEstate> performRequest();
}
