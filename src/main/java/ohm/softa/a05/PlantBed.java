package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBed {
    private SimpleList<Plant> plants = new SimpleListImpl<>();

    public void add(Plant plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<Plant> getPlantsByColor(PlantColor color) {
        return plants.filter(plant -> plant.getColor().equals(color));
    }
}
