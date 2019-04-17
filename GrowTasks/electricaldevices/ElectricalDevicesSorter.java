package growepam.electricaldevices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricalDevicesSorter implements RequestHandler{
    public void performRequest(List<ElectricalDevice> electricalDevices){
           for (ElectricalDevice tempDevice : sortByPowerConsumption(electricalDevices)){
               System.out.println(tempDevice);
           }
    }

    private List<ElectricalDevice> sortByPowerConsumption(List<ElectricalDevice> electricalDevicesList){
        ElectricalDevice[] electricalDevicesArray = electricalDevicesList.toArray(new ElectricalDevice[0]);
        for (int i = 0; i < electricalDevicesArray.length; i++){
            for (int j = 0; j < electricalDevicesArray.length -1; j++){
                if (electricalDevicesArray[j].getPowerConsumption() > electricalDevicesArray[j+1].getPowerConsumption()){
                    ElectricalDevice temp = electricalDevicesArray[j];
                    electricalDevicesArray[j] = electricalDevicesArray[j+1];
                    electricalDevicesArray[j+1] = temp;
                }
            }
        }
        electricalDevicesList.clear();
        electricalDevicesList.addAll(Arrays.asList(electricalDevicesArray));
        return electricalDevicesList;
    }
}
