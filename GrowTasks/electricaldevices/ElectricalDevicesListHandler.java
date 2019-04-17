package growepam.electricaldevices;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ElectricalDevicesListHandler implements RequestHandler{
    private Scanner scan = new Scanner(System.in);
    private ListModifierType modifierType;

    public ElectricalDevicesListHandler(){}
    public ElectricalDevicesListHandler(ListModifierType modifierType){
        this.modifierType = modifierType;
    }

    public void performRequest(List<ElectricalDevice> electricalDevices){
        switch (modifierType){
            case ADD:
                addToList(electricalDevices);
                break;
            case REMOVE:
                removeFromList(electricalDevices);
                break;
            case GET:
                new ElectricalDevicePrinter().performRequest(getFromList(electricalDevices));
                break;
            default:
                return;
        }
    }

    private void addToList(List<ElectricalDevice> electricalDevices){
        System.out.println("Please enter name of electrical device and its power consumption");
        String deviceName;
        do{
            deviceName = nameReader();
            if (deviceName.equals("")){
                System.out.println("You have entered no name! Please retry!!!");
                continue;
            }
            break;
        }while (true);
        double powerConsumption = powerValueReader();
        ElectricalDevice electricalDevice = ElectricalDeviceManager.getDeviceByName(electricalDevices,deviceName);
        if (electricalDevice == null){
            electricalDevices.add(new ElectricalDevice(deviceName,powerConsumption));
        }else{
            System.out.println("Electrical device with such name is already present in list");
            electricalDevice.setPowerConsumption(powerConsumption);
        }
    }

    private void removeFromList(List<ElectricalDevice> electricalDevices){
        System.out.println("Please enter name of electrical device and its power consumption");
        String deviceName = nameReader();
        ElectricalDevice electricalDevice = ElectricalDeviceManager.getDeviceByName(electricalDevices,deviceName);
        if (electricalDevice == null){
            System.out.println("There is no such electrical device");
        }else{
            electricalDevices.remove(electricalDevice);
        }
    }

    private List<ElectricalDevice> getFromList(List<ElectricalDevice> electricalDevices){
        List<ElectricalDevice> customElectricalDevices = new LinkedList<>();
        System.out.println("Please enter name of electrical device you are looking for (Press Enter to ignore)");
        String deviceName = nameReader();
        System.out.println("Please enter power consumption of electrical device you are looking for (Press Enter to ignore)");
        double powerConsumption;
        do{
            try {
                String temp = scan.nextLine();
                if (temp.equals("")){
                    powerConsumption = 0.0;
                    break;
                }else {
                    powerConsumption = Double.parseDouble(temp);
                }
            } catch (NumberFormatException e){
                System.out.println("You have entered wrong value of power consumption! Please retry!");
                continue;
            }
            break;
        }while (true);
        boolean hasName = (!deviceName.equals(""));
        boolean hasPowerConsumption = (powerConsumption != 0.0);
        for (ElectricalDevice tempDevice : electricalDevices){
            if (hasName && hasPowerConsumption){
                if ((tempDevice.getDeviceName().equals(deviceName)) && (tempDevice.getPowerConsumption() == powerConsumption)){
                    customElectricalDevices.add(tempDevice);
                }
            }else if (hasName){
                if (tempDevice.getDeviceName().equals(deviceName)){
                    customElectricalDevices.add(tempDevice);
                    break;
                }
            }else{
                if (tempDevice.getPowerConsumption() == powerConsumption){
                    customElectricalDevices.add(tempDevice);
                }
            }
        }
        return customElectricalDevices;
    }

    private String nameReader(){
        String deviceName = null;
        System.out.println("Name of device: ");
        deviceName = scan.nextLine().toUpperCase();
        return deviceName;
    }

    private double powerValueReader(){
        double powerConsumption = 0.0;

        do{
            try{
                System.out.println("Power consuption: ");
                powerConsumption = Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException e){
                System.out.println("You have entered wrong value of power consumption! Please retry!");
                continue;
            }
            break;
        }while (true);

        return powerConsumption;
    }

//
}
