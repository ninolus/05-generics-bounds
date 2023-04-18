package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import org.apache.commons.lang3.NotImplementedException;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plants = new SimpleListImpl<>();

    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(plant -> plant.getColor().equals(color));
    }

    // die SimpleList unterstützt kein Remove, also ignorieren wir das mal
    public void remove(T plant) {
        throw new NotImplementedException();
    }
}
