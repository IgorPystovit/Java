package growepam.electricaldevices;

import java.util.List;
import java.util.Scanner;

public class StateSwitcher implements RequestHandler{
    private static Scanner scan = new Scanner(System.in);
    public WiringLoadChecker loadChecker = new WiringLoadChecker();
    private PowerState powerState;

    public StateSwitcher(){}
    public StateSwitcher(PowerState powerState){
        this.powerState = powerState;
    }

    public void performRequest(List<ElectricalDevice> electricalDevices){
        System.out.println("Type name of electrical device below");
        String deviceName = scan.nextLine().toUpperCase();
        ElectricalDevice electricalDevice = ElectricalDeviceManager.getDeviceByName(electricalDevices,deviceName);

        if (electricalDevice == null){
            return;
        }

        switch (powerState){
            case ON:
                turnDeviceOn(electricalDevice);
                break;
            case OFF:
                turnDeviceOff(electricalDevice);
                break;
            default:
                System.out.println("Error message");
                return;
        }
        System.out.println("Total wiring load: "+loadChecker.getWiringLoad());
        try{
            loadChecker.checkWiringLoad();
        } catch (WiringOverloadException e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    private void turnDeviceOn(ElectricalDevice electricalDevice){
        if (electricalDevice.getPowerState() == PowerState.ON){
                System.out.println("Device is already on");
            }else{
                electricalDevice.turnOn();
                loadChecker.addWiringLoad(electricalDevice.getPowerConsumption());
            }
    }

    private void turnDeviceOff(ElectricalDevice electricalDevice){
        if (electricalDevice.getPowerState() == PowerState.OFF){
                System.out.println("Device is already off");
            }else{
                electricalDevice.turnOff();
                loadChecker.reduceWiringLoad(electricalDevice.getPowerConsumption());
            }
    }
}
