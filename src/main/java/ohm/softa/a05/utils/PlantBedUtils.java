package ohm.softa.a05.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBedUtils {

    public <T extends Plant> void repot(PlantBed<T> from, PlantColor color, PlantBed<T> to) {
        SimpleList<T> plants_to_repot = from.getPlantsByColor(color);
        plants_to_repot.forEach(plant -> {
//            from.remove(plant); // todo
            to.add(plant);
        });
    }
}
