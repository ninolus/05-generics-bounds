package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {
    SimpleList<T> plants = new SimpleListImpl<>();

    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        SimpleList<T> coloredPlants = new SimpleListImpl<>();
        for (T plant : plants) {
            if (plant.getColor().equals(color)) {
                coloredPlants.add(plant);
            }
        }
        return coloredPlants;
    }

    public void remove(T plant) {
        plants = plants.filter(elem -> elem.equals(plant));
    }
}
