package growepam.electricaldevices;

import java.util.*;

public class ElectricalDeviceManager {
    private List<ElectricalDevice> electricalDevices = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private WiringLoadChecker loadChecker = new WiringLoadChecker();
    public void manageDevices(){
        System.out.println("Welcome to electrical devices management system");
        System.out.println("Please enter maximum value of power which your wiring can take simultaneously");
        loadChecker.readMaxValue();
        System.out.println("Available actions:\n" +
                "- add (to add device to list);\n" +
                "- remove (to remove device from list);\n" +
                "- get (to get device from lsit);\n" +
                "- turn on (to turn on a device);\n" +
                "- turn off (to turn off a device);\n" +
                "- sort (to sort list of devices by power consumption in ascending order);\n" +
                "- display (to display list of electrical devices);");
        do{
            System.out.println("\nPlease type your request");
            String requestListener = scan.nextLine().toUpperCase();
            RequestType requestType = null;
            switch (requestListener){
                case "ADD":
                    requestType = RequestType.ADD;
                    break;
                case "REMOVE":
                    requestType = RequestType.REMOVE;
                    break;
                case "GET":
                    requestType = RequestType.GET;
                    break;
                case "DISPLAY":
                    requestType = RequestType.DISPLAY;
                    break;
                case "TURN ON":
                    requestType = RequestType.ON;
                    break;
                case "TURN OFF":
                    requestType = RequestType.OFF;
                    break;
                case "SORT":
                    requestType = RequestType.SORT;
                    break;
                case "EXIT":
                    return;
                default:
                    System.out.println("No such request! Please retry!");
            }
            requestExecutor(requestType);
        }while (true);

    }

    private void requestExecutor (RequestType requestType){
        if (requestType == null){
            return;
        }
        switch (requestType){
            case ADD:
                process(electricalDevices, new ElectricalDevicesListHandler(ListModifierType.ADD));
                break;
            case REMOVE:
                process(electricalDevices, new ElectricalDevicesListHandler(ListModifierType.REMOVE));
                break;
            case GET:
                process(electricalDevices,new ElectricalDevicesListHandler(ListModifierType.GET));
                break;
            case DISPLAY:
                process(electricalDevices, new ElectricalDevicePrinter());
                break;
            case SORT:
                process(electricalDevices,new ElectricalDevicesSorter());
                break;
            case ON:
                process(electricalDevices, new StateSwitcher(PowerState.ON));
                break;
            case OFF:
                process(electricalDevices, new StateSwitcher(PowerState.OFF));
                break;
            default:
                return;
        }
    }

    private void process(List<ElectricalDevice> electricalDevices, RequestHandler requestHandler){
        requestHandler.performRequest(electricalDevices);
    }

    public static ElectricalDevice getDeviceByName(List<ElectricalDevice> electricalDevices, String deviceName){
        ElectricalDevice electricalDevice = null;
        for (ElectricalDevice tempDevice : electricalDevices){
            if (tempDevice.getDeviceName().equals(deviceName)){
                electricalDevice = tempDevice;
                break;
            }
        }
        return electricalDevice;
    }



    public List<ElectricalDevice> getElectricalDevices(){
        return electricalDevices;
    }

    public static void main(String[] args) {
        ElectricalDeviceManager manager = new ElectricalDeviceManager();
        manager.manageDevices();
    }
}
