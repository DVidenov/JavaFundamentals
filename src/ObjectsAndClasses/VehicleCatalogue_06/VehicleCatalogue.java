package ObjectsAndClasses.VehicleCatalogue_06;

public class VehicleCatalogue {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setModelOfVehicle(String modelOfVehicle) {
        this.modelOfVehicle = modelOfVehicle;
    }

    public void setColorOfVehicle(String colorOfVehicle) {
        this.colorOfVehicle = colorOfVehicle;
    }

    public void setHorsepowerOfVehicle(int horsepowerOfVehicle) {
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    public VehicleCatalogue(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }
}
