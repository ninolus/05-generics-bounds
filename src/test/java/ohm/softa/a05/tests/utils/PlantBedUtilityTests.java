package ohm.softa.a05.tests.utils;

import ohm.softa.a05.model.*;
import ohm.softa.a05.utils.PlantBedUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantBedUtilityTests {
    private PlantBed<Flower> flowerBed;

    @BeforeEach
    void setup() {
        flowerBed = new PlantBed<>();

        flowerBed.add(new Flower(PlantColor.YELLOW));
        flowerBed.add(new Flower(PlantColor.RED));
        flowerBed.add(new Flower(PlantColor.YELLOW));
        flowerBed.add(new Flower(PlantColor.YELLOW));
        flowerBed.add(new Flower(PlantColor.RED));
        flowerBed.add(new Flower(PlantColor.ORANGE));
    }

    @Test
    void testRepot1() {
        PlantBed<Plant> output1 = new PlantBed<>();
        PlantBed<Flower> output2 = new PlantBed<>();
//        PlantBed<Shrub> output3 = new PlantBed<>();

        PlantBedUtility.repot(flowerBed, PlantColor.YELLOW, output1);
        PlantBedUtility.repot(flowerBed, PlantColor.YELLOW, output2);
//        PlantBedUtility.repot(flowerBed, PlantColor.YELLOW, output3); // Das klappt nicht!
    }
}
