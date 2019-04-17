package growepam.electricaldevices;

import java.util.List;

public class ElectricalDevicePrinter implements RequestHandler{

    public void performRequest(List<ElectricalDevice> electricalDevices){
        System.out.println();
        if (electricalDevices.size() == 0){
            System.out.println("There is no electrical devices");
        }else{
            for (ElectricalDevice tempDevice : electricalDevices){
                System.out.println(tempDevice);
            }
        }
    }

}
