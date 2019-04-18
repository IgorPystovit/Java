package growepam.electricaldevices.electricaldevice;


import growepam.electricaldevices.requesthandlers.DeviceManagerMenu;

public class ElectricalDeviceManager {

    private static DeviceManagerMenu deviceManagerMenu = new DeviceManagerMenu();
    //P
    public static void main(String[] args) {
        deviceManagerMenu.manager();
    }
}
