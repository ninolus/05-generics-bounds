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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shrub shrub = (Shrub) o;
        return (this.getColor() == shrub.getColor())
                && (this.getFamily().equals(shrub.getFamily()))
                && (this.getHeight() == shrub.getHeight())
                && (this.getName().equals(shrub.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getFamily(), this.getHeight(), this.getName());
    }

    @Override
    public String toString() {
        return String.format("Shrub: Height: %s, Family: %s, Name: %s, Color: %s",
                this.getHeight(), this.getFamily(), this.getName(), this.getColor());
    }
}
