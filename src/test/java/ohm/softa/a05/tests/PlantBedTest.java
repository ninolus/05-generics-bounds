package ohm.softa.a05.tests;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTest {

    @Test
    public void testAddToPlantBed() throws Exception {
        PlantBed objectUnderTest = new PlantBed();

        objectUnderTest.add(new Flower(1, "family", "name", PlantColor.RED));
        objectUnderTest.add(new Flower(1, "family", "name", PlantColor.BLUE));
        objectUnderTest.add(new Shrub(1, "family", "name"));

        assertEquals(objectUnderTest.size(), 3);
    }

    @Test
    public void testGetRedPlantsShouldReturnOnlyRedPlants() throws Exception {
        PlantBed objectUnderTest = new PlantBed();
        Flower red1 = new Flower(1, "family", "name", PlantColor.RED);
        objectUnderTest.add(red1);
        Flower red2 = new Flower(2, "family", "othername", PlantColor.RED);
        objectUnderTest.add(red2);
        objectUnderTest.add(new Flower(1, "family", "name", PlantColor.BLUE));
        objectUnderTest.add(new Shrub(1, "family", "shrubname"));
        objectUnderTest.add(new Shrub(1, "family", "othershrubname"));

        SimpleList<Plant> actual = objectUnderTest.getPlantsByColor(PlantColor.RED);

        SimpleList<Plant> expected = new SimpleListImpl<>();
        expected.add(red1);
        expected.add(red2);
        assertEquals(expected.size(), actual.size());
    }
}
