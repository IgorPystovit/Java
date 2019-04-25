package growepam.airline.airlineengine;

import growepam.airline.Airline;
import growepam.airline.airlineengine.Reader;
import growepam.airline.plane.Plane;
import growepam.airline.plane.PlaneManager;

import java.util.*;

//This class represents evaluator that evaluates airline by different parameters
//It mainly consists of methods that provide such evaluation
public class AirlineEvaluator {
    //Invokes method according to user request
    public void evaluator(Airline airline){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Request list:\n" +
                    "- Passenger capacity (to evaluate passenger capacity);\n" +
                    "- Load capacity (to evaluate load capacity);\n" +
                    "- Sort by range (to sort by flight range);\n" +
                    "- Find by fuel consumption (to find plane by fuel consumption);\n" +
                    "- Show all (to print all available planes);\n" +
                    "- Print aircraft (to print all planes presented on aircraft list);\n" +
                    "- Exit (to exit airline evaluator;\n");
            System.out.println("Type your request");
            String request = scan.nextLine().toUpperCase();
            switch (request){
                case "SHOW ALL":
                    PlaneManager.printCollection(PlaneManager.getPlaneSet());
                    break;
                case "PRINT AIRCRAFT":
                    PlaneManager.printCollection(airline.getPlanes());
                    break;
                case "FIND BY FUEL CONSUMPTION":
                    System.out.println("Enter needed fuel consumption");
                    double customFuelConsunption = Reader.readDouble();
                    PlaneManager.printCollection(getByFuelConsuption(airline,customFuelConsunption));
                    break;
                case "PASSENGER CAPACITY":
                    double totalPassengerCapacity = evaluatePassengerCapacity(airline);
                    System.out.println("Total passenger capacity: "+totalPassengerCapacity+'\n');
                    break;
                case "LOAD CAPACITY":
                    double totalLoadCapacity = evaluateLoadCapacity(airline);
                    System.out.println("Total load capacity: "+totalLoadCapacity+'\n');
                    break;
                case "SORT BY RANGE":
                    sortByFlightRange(airline);
                    System.out.println("Sorted!\n");
                    break;
                case "EXIT":
                    return;
                default:
                    System.out.println("No such request! Please retry!");
            }

        }while (true);
    }

    private double evaluatePassengerCapacity(Airline airline){
        double totalPassengerCapacity = 0.0;
        Set<Plane> planes = airline.getPlanes();
        for (Plane tempPlane : planes){
            totalPassengerCapacity += tempPlane.getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    private double evaluateLoadCapacity(Airline airline){
        double totalLoadCapacity = 0.0;
        Set<Plane> planes = airline.getPlanes();
        for (Plane tempPlane : planes){
            totalLoadCapacity += tempPlane.getLoadCapacity();
        }
        return totalLoadCapacity;
    }

    private void sortByFlightRange(Airline airline){
        List<Plane> planes = new LinkedList<>(airline.getPlanes());
        sort(planes,0,planes.size() - 1);
        airline.getPlanes().clear();
        airline.getPlanes().addAll(planes);
    }

    private int partition(List<Plane> planes, int left, int right){
        Plane pivot = planes.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++){
            Plane current = planes.get(j);
            if (current.getFlightRange() <= pivot.getFlightRange()){
                i++;
                Plane temp = planes.get(i);
                planes.set(i,current);
                planes.set(j,temp);
            }
        }
        i++;
        Plane temp = planes.get(i);
        planes.set(i,pivot);
        planes.set(right,temp);
        return i;
    }

    private void sort(List<Plane> planes, int left, int right){
        if (left <= right){
            int partitionValue = partition(planes,left,right);
            sort(planes,left,partitionValue - 1);
            sort(planes,partitionValue + 1,right);
        }
    }

    private List<Plane> getByFuelConsuption(Airline airline, double customFuelConsuption){
        List<Plane> planes = new LinkedList<>();
        for (Plane tempPlane : airline.getPlanes()){
            if (Math.abs(tempPlane.getFuelConsumption() - customFuelConsuption) <= 100){
                planes.add(tempPlane);
            }
        }
        return planes;
    }
}
