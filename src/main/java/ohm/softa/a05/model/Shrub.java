package ohm.softa.a05.model;

import java.util.Objects;

public class Shrub extends Plant {
    private final PlantColor color;

    public Shrub(double height, String family, String name) {
        super(height, family, name);
        this.color = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Shrub: Height: %s, Family: %s, Name: %s, Color: %s",
                this.getHeight(), this.getFamily(), this.getName(), this.getColor());
    }
}
