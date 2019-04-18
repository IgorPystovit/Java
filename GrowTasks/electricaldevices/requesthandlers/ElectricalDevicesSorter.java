package growepam.electricaldevices.requesthandlers;

import growepam.electricaldevices.electricaldevice.ElectricalDevice;

import java.util.Arrays;
import java.util.List;

/*This class represents engine which sorts electrical devices by their
* power consumption in ascending order*/
public class ElectricalDevicesSorter implements RequestHandler {
    private ElectricalDevicePrinter electricalDevicePrinter = new ElectricalDevicePrinter();

    //Calls sort method and then prints it
    public void performRequest(List<ElectricalDevice> electricalDevices){
           electricalDevicePrinter.performRequest(sortByPowerConsumption(electricalDevices));
    }

    /*Represents sort process by turning list of electrical devices in array
     and sorting it with bubble sort in ascending order*/
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
