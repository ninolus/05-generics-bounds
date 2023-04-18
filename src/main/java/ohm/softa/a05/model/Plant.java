package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private String family;
    private String name;

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();


    @Override
    public int compareTo(Plant o) {
        if (this.getHeight() < o.getHeight()) {
            return -1;
        } else if (this.getHeight() == o.getHeight()) {
            return 0;
        }
        return 1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        // hier gäbe es auch library Funktionen
        return (this.getColor() == plant.getColor())
                && (this.getFamily().equals(plant.getFamily()))
                && (this.getHeight() == plant.getHeight())
                && (this.getName().equals(plant.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getFamily(), this.getHeight(), this.getName());
    }

}


