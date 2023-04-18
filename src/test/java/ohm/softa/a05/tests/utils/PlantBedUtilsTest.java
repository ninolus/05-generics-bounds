package ohm.softa.a05.tests.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.utils.PlantBedUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedUtilsTest {

    @Test
    void testRepotRedPlants() throws Exception {
        PlantBed<Plant> to = new PlantBed<>();
        PlantBed<Plant> from = new PlantBed<>();
        Flower red1 = new Flower(1, "famil1", "name1", PlantColor.RED);
        Flower red2 = new Flower(1, "family2", "name2", PlantColor.RED);
        from.add(red1);
        from.add(red2);
        Flower not_red1 = new Flower(3, "family3", "name3", PlantColor.BLUE);
        from.add(not_red1);
        Shrub not_red2 = new Shrub(4, "family4", "name4");
        from.add(not_red2);

        PlantBedUtils objectUnderTest = new PlantBedUtils();
        objectUnderTest.repot(from, PlantColor.RED, to);

        PlantBed<Plant> to_expected = new PlantBed<>();
        to_expected.add(red1);
        to_expected.add(red2);
        assertEquals(to_expected.size(), to.size());
    }

    // todo: Test repotting from Flower to Plant bed
    // todo: Test repotting from Plant to Flower bed <-- this should not work!
}
