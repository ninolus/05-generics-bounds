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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return (this.getColor() == flower.getColor())
                && (this.getFamily().equals(flower.getFamily()))
                && (this.getHeight() == flower.getHeight())
                && (this.getName().equals(flower.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getFamily(), this.getHeight(), this.getName());
    }


    @Override
    public String toString() {
        return String.format("Flower: Height: %s, Family: %s, Name: %s, Color: %s",
                this.getHeight(), this.getFamily(), this.getName(), this.getColor());
    }
}