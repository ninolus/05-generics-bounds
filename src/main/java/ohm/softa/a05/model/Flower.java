package ohm.softa.a05.model;

import java.util.Objects;

public class Flower extends Plant {
    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) throws Exception {
        super(height, family, name);
        if (color == PlantColor.GREEN) {
            throw new Exception("Flowers cannot be green!");
        }
        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return color;
    }

}
