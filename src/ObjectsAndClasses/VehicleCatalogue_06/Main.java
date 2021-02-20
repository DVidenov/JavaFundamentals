package ObjectsAndClasses.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<VehicleCatalogue> vehicles = new ArrayList<>();
        double sumCarsPower = 0;
        double sumTrucksPower = 0;
        double countCars = 0;
        double countTrucks = 0;
        while (!input.equals("End")){

            String typeOfVehicle = input.split(" ")[0];
            String modelOfVehicle = input.split(" ")[1];
            String colorOfVehicle = input.split(" ")[2];
            int horsepowerOfVehicle = Integer.parseInt(input.split(" ")[3]);
            VehicleCatalogue vehicle = new VehicleCatalogue(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }
        if (input.equals("End")){
            input = scanner.nextLine();
            String vehicleModel = input;
            while (!vehicleModel.equals("Close the Catalogue")){
                for (VehicleCatalogue vehicle:vehicles) {
                    if (vehicleModel.equals(vehicle.getModelOfVehicle())){
                        System.out.printf("Type: %s\nModel: %s\nColor: %s\nHorsepower: %s\n",
                                vehicle.getTypeOfVehicle().substring(0, 1).toUpperCase() + vehicle.getTypeOfVehicle().substring(1), vehicle.getModelOfVehicle(),vehicle.getColorOfVehicle(), vehicle.getHorsepowerOfVehicle());
                        vehicleModel = scanner.nextLine();
                        if (vehicleModel.equals("Close the Catalogue")){

                            for (VehicleCatalogue vehicl:vehicles) {
                                if (vehicl.getTypeOfVehicle().equals("truck")){
                                    sumTrucksPower += vehicl.getHorsepowerOfVehicle();
                                    countTrucks++;
                                } else if (vehicl.getTypeOfVehicle().equals("car")){
                                    sumCarsPower += vehicl.getHorsepowerOfVehicle();
                                    countCars++;
                                }
                            }
                            double horsepowerCarsDivided = sumCarsPower/countCars;
                            double horsepowerTrucksDivided = sumTrucksPower/countTrucks;
                            System.out.printf("Cars have average horsepower of: %.2f.\n", horsepowerCarsDivided);
                            System.out.printf("Trucks have average horsepower of: %.2f.", horsepowerTrucksDivided);
                        }else{
                            continue;
                        }
                    }
                }
            }
        }
    }
}
