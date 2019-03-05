package ninethChapter.adbstraction.vehicles;

import ninethChapter.adbstraction.vehicleInterface.Vehicle;

public class Plane implements Vehicle {
    public int engineVolume = 5;
    public void ride(){
        System.out.println("Riding plane");
    }

    public void adjust(int engineVolume){
        System.out.println(engineVolume+" volume engine adjusted");
    }
    public int getEngineVolume(){
        return engineVolume;
    }

    public static void main(String[] args) {
        Plane model = new Plane();
        model.adjust(model.getEngineVolume());
        model.ride();
    }
}
