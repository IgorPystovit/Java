package growepam.preciousstones;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class StonesPrinter{
    public static void printComponents(Map<Gemstone,Double> gemstones){
        if ((gemstones == null) || (gemstones.size() == 0)){
            System.out.println("There is no components\n");
            return;
        }
        for (Map.Entry<Gemstone,Double> entry : gemstones.entrySet()){
            System.out.println(entry.getKey());
            System.out.println("Weight: "+entry.getValue());
        }
    }

    public static void printProducts(Map<String,Map<Gemstone,Double>> gemstones){
        if ((gemstones == null) || (gemstones.size() == 0)){
            System.out.println("There is no components\n");
            return;
        }
        for (Map.Entry<String,Map<Gemstone,Double>> entry : gemstones.entrySet()){
            System.out.println("Product name: "+entry.getKey());
            System.out.println("Product components: ");
            printComponents(entry.getValue());
        }
    }

    public static void printStones(Collection<Gemstone> gemstones){
        if ((gemstones == null) || (gemstones.size() == 0)){
            System.out.println("There is no stones\n");
            return;
        }
        for (Gemstone tempGemstone : gemstones){
            System.out.println(tempGemstone);
        }
    }
}
