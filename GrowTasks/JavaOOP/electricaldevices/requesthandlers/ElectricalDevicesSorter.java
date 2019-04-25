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

    /*Represents sort process
     Sorts given list with quick sort in ascending order*/
    private List<ElectricalDevice> sortByPowerConsumption(List<ElectricalDevice> electricalDevicesList){
        sort(electricalDevicesList,0,electricalDevicesList.size() - 1);
        return electricalDevicesList;
    }

    //Quick sort
    private void sort(List<ElectricalDevice> electricalDevices, int left, int right){
        if (left <= right){
            int partitionNum = partition(electricalDevices,left,right);
            sort(electricalDevices,left,partitionNum-1);
            sort(electricalDevices,partitionNum+1,right);
        }
    }

    private int partition(List<ElectricalDevice> electricalDevices,int left,int right){
        ElectricalDevice pivot = electricalDevices.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++){
            if (electricalDevices.get(j).getPowerConsumption() <= pivot.getPowerConsumption()){
                i++;
                ElectricalDevice temp = electricalDevices.get(j);
                electricalDevices.set(j,electricalDevices.get(i));
                electricalDevices.set(i,temp);
            }
        }
        i++;
        ElectricalDevice temp = electricalDevices.get(i);
        electricalDevices.set(i,pivot);
        electricalDevices.set(right,temp);
        return i;
    }
}
