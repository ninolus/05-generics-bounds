package ohm.softa.a05.utils;

import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

public abstract class PlantBedUtility {

    public static <T extends Plant> void repot(PlantBed<T> from, PlantColor color, PlantBed<? super T> to) {
        for (T plant : from.getPlantsByColor(color)) {
            from.remove(plant);
            to.add(plant);
        }
    }
}
