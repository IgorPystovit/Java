package growepam.preciousstones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Got list of precious stones
public class PreciousStoneManager {
    private List<Gemstone> gemstonesList = new ArrayList<>(Arrays.asList(
            new Gemstone("Diamond",Valuation.PRECIOUS,Clarity.TRANSPARENT,9050),
            new Gemstone("Ruby",Valuation.PRECIOUS,Clarity.TRANSCLUENT,6500),
            new Gemstone("Sapphire",Valuation.PRECIOUS,Clarity.TRANSPARENT,7000),
            new Gemstone("Alexandrite",Valuation.PRECIOUS,Clarity.TRANSPARENT,5000),
            new Gemstone("Emerald",Valuation.SEMIPRECIOUS,Clarity.TRANSPARENT,4000),
            new Gemstone("Agate",Valuation.SEMIPRECIOUS,Clarity.OPAQUE,1000),
            new Gemstone("Amazonite",Valuation.SEMIPRECIOUS,Clarity.OPAQUE,500),
            new Gemstone("Amber",Valuation.SEMIPRECIOUS,Clarity.TRANSCLUENT,1100),
            new Gemstone("Amethyst",Valuation.PRECIOUS,Clarity.TRANSPARENT,3000),
            new Gemstone("Citrine",Valuation.SEMIPRECIOUS,Clarity.TRANSPARENT,1700),
            new Gemstone("Ametrine",Valuation.PRECIOUS,Clarity.TRANSPARENT,2700),
            new Gemstone("Aquamarine",Valuation.PRECIOUS,Clarity.TRANSPARENT,2000)));

    public List<Gemstone> getGemstonesList() {
        return gemstonesList;
    }

    public List<Gemstone> getGemtonesByClarity(Clarity clarity){
        if (clarity == null){
            System.out.println("There is no specified clarity");
            return null;
        }
        List<Gemstone>  gemstonesByClarity = new LinkedList<>();
        for (Gemstone stone : new ArrayList<>(gemstonesList)){
            if (stone.getClarity().equals(clarity)){
                gemstonesByClarity.add(stone);
            }
        }
        return gemstonesByClarity;
    }

    public Gemstone getGemstoneByName(String gemstoneName){
        if (gemstoneName == null){
            System.out.println("There is no specified gemstone name");
            return null;
        }
        Gemstone requestedGemstone = null;
        for (Gemstone tempGemstone : gemstonesList){
            if (tempGemstone.getName().equals(gemstoneName)){
                requestedGemstone = tempGemstone;
                break;
            }
        }
        if (requestedGemstone == null){
            System.out.println("There is no gemstone with such name presented on the list");
        }
        return requestedGemstone;
    }

    public List<Gemstone> getGemstonesByPrice(){
        return null;
    }


//    public void printStones(){
//        for (Gemstone stone : new ArrayList<>(gemstonesList)){
//            System.out.println(stone);
//        }
//    }
//

}
