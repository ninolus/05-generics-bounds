package ohm.softa.a05.model;

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
}


