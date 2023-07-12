package ohm.softa.a05.model;

abstract public class Plant {
    double height;
    String family;
    String name;
    PlantColor color;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor() {
        return color;
    }
}
