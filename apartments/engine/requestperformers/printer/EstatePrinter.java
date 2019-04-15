package com.epam.apartments.engine.requestperformers.printer;

import com.epam.apartments.realestate.RealEstate;
import com.epam.apartments.estatemanagers.RealEstateManager;
import com.epam.apartments.engine.requestperformers.RequestHandler;

import java.util.LinkedList;
import java.util.List;

public class EstatePrinter implements RequestHandler {
    private RealEstateManager estateManager = new RealEstateManager();

    public List<RealEstate> performRequest(){
        List<RealEstate> estateList = new LinkedList<>(estateManager.getEstateList());
        for (RealEstate TempEstate :estateList){
            System.out.println(TempEstate);
        }
        return estateList;
    }

}
